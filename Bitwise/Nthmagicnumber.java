package Bitwise;

public class Nthmagicnumber {
    
public static void main (String[] args) {
    int n=8;
    int ans = 0;
    int power = 5;

    while (n > 0) {
        
        ans += (n & 1) * power;
        System.out.println(ans);
        power *= 5;
        n= n>>1;
    }

    System.out.println(ans);
}
}
