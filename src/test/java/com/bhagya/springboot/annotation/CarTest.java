package com.bhagya.springboot.annotation;

import com.bhagya.springboot.map.MapExample;
import com.bhagya.springboot.stream.Movie;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void getJsonTest(){
        Car car = new Car("Ford", "F150", "2018");
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(car);
    }
}