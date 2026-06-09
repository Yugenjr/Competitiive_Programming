package Bitwise;
public class UniqueElement {
    public static void main(String[] args) {
        int arr[]={2,3,1,6,3,6,2};
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];
        }
        System.out.println(unique);
    }
}