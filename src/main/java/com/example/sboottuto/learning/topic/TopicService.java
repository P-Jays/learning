package com.example.sboottuto.learning.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
        new Topic(1,"Java","Java Description"),
        new Topic(2,"Javascript","Javascript Description"),
        new Topic(3,"SpringBoot","SpringBoot Description")
     );

     public List<Topic>getTopic(){
         return topics;
     }
}
