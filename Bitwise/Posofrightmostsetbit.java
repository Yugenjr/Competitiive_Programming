package Bitwise ;
public class Posofrightmostsetbit {
     public static void main(String[] args) {
        int n=18;
        int bitmask=n & (-n) ;
        int pos=(int)(Math.log(bitmask)/Math.log(2))+1 ;
        System.out.println(pos);
    }
}
// divide the number as a | b . b will be alwayss 0 !! 
