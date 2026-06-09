

public class Rec{
    public static void main(String[] args) {
        int i=1;
        num(i);
    }
    static void num(int n){
        if (n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        num(n+1);
}
}