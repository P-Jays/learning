package com.example.sboottuto.learning.topic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void setTopic(@RequestBody Topic topic){
         topicService.setTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{name}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String name){
        topicService.updateTopic(topic, name);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
    public void deleteTopic(@PathVariable String name){
        topicService.deleteTopic(name);
    }
}
