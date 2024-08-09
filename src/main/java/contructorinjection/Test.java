package contructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("consinjecconfig.xml");
        first student = (first) context.getBean("cc1");

        System.out.println(student);
    }
}
