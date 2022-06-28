package io.stanleywang.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

// With @Entity and @Id can convert to a Row in DB, and convert from Row to Class.
@Entity
public class Topic {

    @Id
    private String id; //Primary key, is the thing that identifies it! If searching for a certain topic, serach by this.

    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        super(); // this line will call the constructor Topic(). So will run that one before our initializations.
                 //    Can also do super(type1), which will call a constructor if exists, Topic(type1 name).
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
