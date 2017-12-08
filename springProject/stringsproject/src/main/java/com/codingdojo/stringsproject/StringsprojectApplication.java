package com.codingdojo.stringsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// 1. Annotation
@RestController
public class StringsprojectApplication {

        public static void main(String[] args) {
                SpringApplication.run(StringsprojectApplication.class, args);
        }
        
        // 1. Annotation
        @RequestMapping("/")
        // 3. Method that maps to the request route above
        public String hello() { // 3
                return "Hello Client! How are you doing?";
        }
        @RequestMapping("/random")
        // 3. Method that maps to the request route above
        public String random() { // 3
                return "Spring boot is Great! So easy to just respond with strings";
        }
        @RequestMapping("/test")
        public String test(@RequestParam(value="q", required=false) String searchQuery) {
            return "You searched for " + searchQuery;
        }
}
