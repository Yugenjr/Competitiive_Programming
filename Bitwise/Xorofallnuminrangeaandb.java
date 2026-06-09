package Bitwise;

public class Xorofallnuminrangeaandb {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=xorofrange(b) ^ xorofrange(a-1);
        System.out.println(ans);
    }
    public static int xorofrange(int a){

        if(a % 4 == 0){
            return a;
        } else if(a % 4 == 1){
            return 1;
        } else if(a % 4 == 2){
            return a+1;
        } else {
            return 0;
        }
    }
}
