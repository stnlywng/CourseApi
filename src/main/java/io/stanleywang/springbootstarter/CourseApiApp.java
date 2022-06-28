package io.stanleywang.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);
        //sets up the default configuration (the 80% use case)
        //Spring is container for your code. Controllers, data services... Application Contexts, that run
        //    when application runs. This starts the application contexts
        //Create classes and annotate with it's intent. Marking classes saying, This is controller, this is a service
        //    and so on. This performs class path scan, it scans for all the classes that are annotated, finds them.
        //Starts a TomCat server. What we do in localhost whatever, is the TomCat server. TomCat came w String Boot!
        //     We didn't download it.
    }

}
