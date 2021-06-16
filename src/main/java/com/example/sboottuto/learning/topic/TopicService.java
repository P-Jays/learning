package com.example.sboottuto.learning.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>( Arrays.asList(
        new Topic(1,"Java","Java Description"),
        new Topic(2,"Javascript","Javascript Description"),
        new Topic(3,"SpringBoot","SpringBoot Description")
        ));

     public List<Topic>getAllTopics(){
         return topics;
     }

     public Topic getTopic(String name){
         return topics.stream().filter(t-> t.getName().equals(name)).findFirst().get();
     }

    public void setTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String name) {
        for(int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if(t.getName().equals(name)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String name) {
        topics.removeIf(t-> t.getName().equals(name));
    }
}
