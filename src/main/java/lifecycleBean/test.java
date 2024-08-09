package lifecycleBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        A a = (A) ac.getBean("lifecycleBean");

        System.out.println(a);
        ac.registerShutdownHook();
    }
}
