package Bitwise;

public class Oddrepetitivefindunique {
    public static void main(String[] args) {
        int arr[]={2,3,1,6,3,6,2,6,3,2};
        int tot=0;
        for(int i=0;i<arr.length;i++){
            tot+=arr[i];
        }
        System.out.println(tot % 3);
    }
}
// every number appears n times but one number appears only once . find that number in O(n) time and O(1) space

// for ths, if every num appears n , then each number have n set bits .  so the set bits get divided into n parts so it is divisible by n . but the number which appears only once will have set bits which are not divisible by n . so we can find that number by taking mod of count of set bits with n.