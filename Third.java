class example {
    private int a;
    int b;

    void fun2() {
        a = 34;
        b = 45;
    }

    void fun3() {
        System.out.println(a);
        System.out.println(b);
    }

    void fun() {
        System.out.println("Hello how are you ");
    }
}

public class third {

    void fun() {
        System.out.println("I am fine ");
    }

    public static void main(String[] args) {
        example v1 = new example();

        v1.fun();
        v1.fun2();
        v1.fun3();
       example v2 = new example();
        v2.fun();
        v2.fun2();
        v2.fun3();
    }

}