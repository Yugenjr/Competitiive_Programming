package Bitwise;
public class Settheithbit {
    public static void main(String[] args) {
        int n=10;
        int i=2;
        int bitmask=(1 << (i - 1))|n;
        System.out.println(bitmask);
    }
}

//to set the ith bit of a number we will use bitwise OR operator
//or operator does give the 1 if any of the bit is 1