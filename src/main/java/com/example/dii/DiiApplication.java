package com.example.dii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ref.B;

@SpringBootApplication
public class DiiApplication {

    public static void main(String[] args) {
        // SpringApplication.run(DiiApplication.class, args); // Commented out for testing

     //   System.out.println("Hello World");

        // Use classpath relative path
//        ApplicationContext context;
//        context = new ClassPathXmlApplicationContext("config.xml");
//        Student student = (Student) context.getBean("user1");
//        Student student3 = (Student) context.getBean("user3");
//
//        System.out.println(student);
//        System.out.println(student3);


//
//        ApplicationContext context;
//        context = new ClassPathXmlApplicationContext("config.xml");
//        StudentCollection student = (StudentCollection) context.getBean("c1");
//
//        System.out.println(student);



        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("refconfig.xml");
        B student = (B) context.getBean("bref");

        System.out.println(student);


    }
}
