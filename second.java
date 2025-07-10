 class Exm {
static void fun(){
    System.out.println("Hello3");

}
    
}
public class second {

    static void fun(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello2");
        fun();
        Exm.fun();
    }
}
