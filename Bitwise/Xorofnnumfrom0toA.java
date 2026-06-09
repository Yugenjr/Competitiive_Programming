package Bitwise;

public class Xorofnnumfrom0toA {
    public static void main(String[] args) {
        int a=5;
        int ans=0;
        if(a % 4 == 0){
            ans=a;
        } else if(a % 4 == 1){
            ans=1;
        } else if(a % 4 == 2){
            ans=a+1;
        } else {
            ans=0;
        }
        System.out.println(ans);
    }
}
