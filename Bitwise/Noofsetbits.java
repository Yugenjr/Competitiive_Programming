package Bitwise;

public class Noofsetbits {
    public static void main(String[] args) {
        int n=7;
        int count=0;
        while(n>0){
            if((n & 1) == 1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    public static void countsetbits2(int n){
        int count=0;
        while(n>0){
            n=n & (n-1);
            count++;
        }
        System.out.println(count);
    }
    public static void countsetbits3(int n){
        int count=0;
        for(int i=0;i<32;i++){
            if((n & (1<<i)) != 0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void countsetbits4(int n){
        int count=0;
        while(n>0){
            count+=n & 1;
            n=n>>1;
        }
        System.out.println(count);
    }
    // or use Integer.bitCount(n) to count set bits in java
    //n-=n & -n; // this will remove the rightmost set bit from n
    public static void countsetbits5(int n){
        int count=0;
        while(n>0){
            n-=n & -n;
            count++;
        }
        System.out.println(count);
    }
}
