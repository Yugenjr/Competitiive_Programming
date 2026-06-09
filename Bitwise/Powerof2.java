package Bitwise;

public class Powerof2 {
    public static void main(String[] args) {
        int n=16;
        if (n == 0) {
            System.out.println("false");
        } else {
            boolean ans=(n & (n-1))==0;
            System.out.println(ans);
        }
    }
}
