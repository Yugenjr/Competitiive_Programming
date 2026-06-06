package BinarySearchMatrices;
import java.util.Arrays;
class BinarySearchJavaRowColSorted {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int x=5;
        int[] ans=search(arr,x);
        System.out.println(Arrays.toString(ans));
}
public static int[] search(int[][] arr,int x){
    int r=0 ; int c=arr[0].length-1;
    while(r<arr.length && c>=0){
        if(arr[r][c]==x){
            return new int[]{r,c};
        }
        else if(arr[r][c]<x){
            r++;
        }
        else{
            c--;
        }
    }
    return new int[]{-1,-1};
}
}