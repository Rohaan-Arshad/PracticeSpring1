package lifecycleBean;

public class A {
    private int a ;

//    public A() {
//        System.out.println("A constructor");
//    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        System.out.println("A setter");
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }


    public void entry(){
        System.out.println("hello gg ");
    }

    public void destroy(){
        System.out.println("byee byee  ");
    }
}
