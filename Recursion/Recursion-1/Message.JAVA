public class Message {
    public static void main(String[] args) {
        m1();
    }
    static void m1(){
        System.out.println("Hello");
        m2();
    }    static void m2(){
        System.out.println("Welcome");
        m3();
    }    static void m3(){
        System.out.println("To");
        m4();
    }    static void m4(){
        System.out.println("Recursion");
    }
}

how it works:

main -> m1() -> prints "Hello"
    -> m2() -> prints "Welcome"
        -> m3() -> prints "To"
            -> m4() -> prints "Recursion" -> returns to m3() -> returns to m2() -> returns to m1() -> returns to main() -> program ends.

            
