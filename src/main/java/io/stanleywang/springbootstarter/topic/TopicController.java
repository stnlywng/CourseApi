package io.stanleywang.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

// We never call/create one, Spring is the one that creates a new TopicController.
@RestController
public class TopicController {

    @Autowired // marks this as something that needs dependency injection. So when Spring comes across this Annotation,
               // while it's creating a new TopicController it looks at what we already created, and when it finds the
               // the singleton that is the Topic Service, it will assign that TopicService to this variable! Autowire
               // Autowires it.
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        // Spring MVC converts this to a JSON when returns.
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{nameOfTopic}")
    public Topic getTopic(@PathVariable("nameOfTopic") String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topics")
    //Tells Request Payload, contains a JSON representation of Topic Instance.
    // Take that BOdy and convert it to a Topic instance, and pass it
    // So in POST, the body, we write a JSON with all the members needed (order doesn't matter).
    // Also include a header with Content-Type set to JSON, so it knows we are giving a JSON.
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
