package Bitwise;

public class Ithbitofanumber {
    public static void main(String[] args) {
        int n=10;
        int i=3;
        int bitmask=n & (1 << (i - 1));
        if((bitmask)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}
