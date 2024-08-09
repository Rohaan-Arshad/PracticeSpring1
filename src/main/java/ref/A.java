package ref;

public class A {
    private int x;

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                '}';
    }

    public A(int x) {
        this.x = x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public A() {
    }
}
