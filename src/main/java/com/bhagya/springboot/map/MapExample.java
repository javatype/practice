package com.bhagya.springboot.map;

import com.bhagya.springboot.stream.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
//@Profile({"prod"})
public class MapExample {
    private static final Logger logger = LoggerFactory.getLogger(MapExample.class);
    private final Map<String, String> localMap;
    private final Movie movie;
    @Autowired
    public MapExample(Map<String, String> localMap, Movie movie) {
        this.localMap = localMap;
        this.movie = movie;
        logger.error("logging:{}", movie);
    }

    public String getName(String key){
        return localMap.get(key);
    }
}
