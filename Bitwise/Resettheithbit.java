package Bitwise;

public class Resettheithbit {
    public static void main(String[] args) {
        int n=10;
        int i=2;
        int bitmask=~(1 << (i - 1));
        int newnumber=bitmask & n;
        System.out.println(newnumber);
    }
}
