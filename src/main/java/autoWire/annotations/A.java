package autoWire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {

    @Autowired
    @Qualifier("aasaa") // use when have two beans and give name of bean you wnat to execute
    private B a ;

    public B getA() {
        return a;
    }

    public void setA(B a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }

    public A(B a) {
        this.a = a;
    }
    public A() {
    }
}
