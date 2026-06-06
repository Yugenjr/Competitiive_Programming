package BinarySearchMatrices;
import java.util.Arrays;
public class BinarySearchSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int x=5;
        int[] ans=search(arr,x);
        System.out.println(Arrays.toString(ans));
}
public static int[] search(int[][] arr,int x){
    int rows=arr.length;
    int cols=arr[0].length;
    if (rows==1) {
        return binarySearch(arr,0,0,cols-1,x);
    }
    //run till 2 rows are remaining
    int rstart=0; int rend=rows-1; int cmid=cols/2;
    while(rstart<rend-1){
        int mid=rstart+(rend-rstart)/2;
        if(arr[mid][cmid]==x){
            return new int[]{mid,cmid};
        }
        else if(arr[mid][cmid]<x){
            rstart=mid;
        }
        else{
            rend=mid;
        }
    }
    //now we have 2 rows
    //check whether the target is in the col of 2 rows
    if(arr[rstart][cmid]==x){
        return new int[]{rstart,cmid};
    }
    if(arr[rend][cmid]==x){
        return new int[]{rend,cmid};
    }
    //search in 1st half
    if(x<=arr[rstart][cmid-1]){
        return binarySearch(arr,rstart,0,cmid-1,x);
    }
    //search in 2nd half

    if(x>=arr[rstart][cmid+1] && x<=arr[rstart][cols-1]){
        return binarySearch(arr,rstart,cmid+1,cols-1,x);
    }

    //search in 3rd half
    if(x<=arr[rend][cmid-1]){
        return binarySearch(arr,rend,0,cmid-1,x);
    }
    //search in 4th half
    if(x>=arr[rend][cmid+1]){
        return binarySearch(arr,rend,cmid+1,cols-1,x);
    }
    return new int[]{-1,-1};
}
public static int[] binarySearch(int[][] arr,int row,int cstart,int cend,int x){
    while(cstart<=cend){
        int mid=cstart+(cend-cstart)/2;
        if(arr[row][mid]==x){
            return new int[]{row,mid};
        }
        else if(arr[row][mid]<x){
            cstart=mid+1;
        }
        else{
            cend=mid-1;
        }
    }
    return new int[]{-1,-1};
}
}