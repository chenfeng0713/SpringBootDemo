package com.chenfen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@SpringBootApplication
public class Application {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public Map index() {
        Map<String, String> map = new HashMap<>();
        map.put("name", env.getProperty("com.chenfeng.name"));
        map.put("desc", env.getProperty("com.chenfeng.desc"));
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
