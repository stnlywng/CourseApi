package io.stanleywang.springbootstarter.topic;

//Standard ones you would want: for DAtaB stuff. Would want for all entities.
//getAllTopics()
//getTopic(String id)
//updateTopic(Topic t)
//deleteTopic(String id)
//don't even need a class to hold these functions, they take care of thesee, we make an itnerface.

import org.springframework.data.repository.CrudRepository;

// Crud has the normal ones, now we just add additional ones we may want. Crud works for any type of Entity.
//  the CrudRepostiroy has the essential funcs u need, and it helps middle man DB and Your Code.
//@Repository
public interface TopicRepository extends CrudRepository<Topic, String> { //Entity, and ID





}
// DB is embedded because we apache imported in pom.xml. So when you start the application, ya feel,
//   JPA knows tht it's the only DB which exists, so it uses that.
//   TopicRepository is an interface b/c no implementation, acc idk why interface.
