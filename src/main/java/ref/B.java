package ref;

public class B {
    int y;
    A a;

    public B(int y, A a) {
        this.y = y;
        this.a = a;
    }

    @Override
    public String toString() {
        return "B{" +
                "y=" + y +
                ", a=" + a +
                '}';
    }

    public B() {
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
