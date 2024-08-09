package contructorinjection;

public class first {
    private int x;
    private int y;

    public first(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "first{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public first() {}
}
