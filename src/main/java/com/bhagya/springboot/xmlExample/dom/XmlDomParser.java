package com.bhagya.springboot.xmlExample.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XmlDomParser {

    private static final String FILENAME = "src/main/resources/xml/staff.xml";

    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(FILENAME));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            System.out.println("------");
            List<Staff> staffs=new ArrayList<>();



            System.out.println("number of staffs"    + staffs.size());



            // get <staff>
            NodeList list = doc.getElementsByTagName("staff");

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    // get staff's attribute
                    String id = element.getAttribute("id");

                    // get text
                    String firstname = element.getElementsByTagName("firstname").item(0).getTextContent();
                    String lastname = element.getElementsByTagName("lastname").item(0).getTextContent();
                    String nickname = element.getElementsByTagName("nickname").item(0).getTextContent();
                    staffs.add(new Staff(firstname,lastname,nickname));
                    NodeList salaryNodeList = element.getElementsByTagName("salary");
                    String salary = salaryNodeList.item(0).getTextContent();

                    // get salary's attribute
                    String currency = salaryNodeList.item(0).getAttributes().getNamedItem("currency").getTextContent();

                    System.out.println("Current Element :" + node.getNodeName());
                    System.out.println("Staff Id : " + id);
                    System.out.println("First Name : " + firstname);
                    System.out.println("Last Name : " + lastname);
                    System.out.println("Nick Name : " + nickname);
                    System.out.printf("Salary [Currency] : %,.2f [%s]%n%n", Float.parseFloat(salary), currency);

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}