package com.example.sboottuto.learning.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @RequestMapping("/topic")
    public List<Topic> getTopic(){
        return Arrays.asList(
           new Topic(1,"Java","Java Description"),
           new Topic(2,"Javascript","Javascript Description"),
           new Topic(3,"SpringBoot","SpringBoot Description")
        );
    }
}
