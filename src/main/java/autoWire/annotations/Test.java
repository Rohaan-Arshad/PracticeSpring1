package autoWire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static  void main(String args[]){
        ApplicationContext ac=new ClassPathXmlApplicationContext("autoWireConfig.xml");
        A s = (A)ac.getBean("emp1");
        System.out.println(s);
    }
}
