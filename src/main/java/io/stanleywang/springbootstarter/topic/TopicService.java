package io.stanleywang.springbootstarter.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Business Service, singleton! Can have stuff depend on this.
// This annotation makes it as a Spring Service. On start, they will create a class of the things with this @,
// which acts as a singleton.
@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    // new ArrayList<>() makes sure it is mutable
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("CS135", "Introduction to Proramming", "First Year CS Course"),
            new Topic("MATH239", "Introduction to Combinatorics", "Hard Math Course"),
            new Topic("CS246", "Introduction to OOP", "Object Oriented Programming")));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
