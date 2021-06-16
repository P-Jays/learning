package com.example.sboottuto.learning.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @Autowired
    TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{name}")
    public Topic getTopic(@PathVariable String name){
        return topicService.getTopic(name);
    }
}
