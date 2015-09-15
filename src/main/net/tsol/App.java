package net.tsol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.joda.time.LocalTime;


@SpringBootApplication
public class App {
    public static void main(String[] args) {
        /*Contribution newContrib = new Contribution();
        newContrib.setName("OpenStack");
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        System.out.println("My current contributions have been to: " + newContrib.getName());
        System.out.println("hello worlds");*/
        SpringApplication.run(App.class, args);



    }
}

