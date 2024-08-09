package autoWire;

public class A {
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
