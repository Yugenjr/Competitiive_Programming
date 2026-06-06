package Sorting;
import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[]arr={5,4,3,1,2,6};
        System.out.println(Arrays.toString(selectionSort2(arr)));
    }
    public static int[] selectionSort(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minInd=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minInd])
                {
                    minInd=j;
                }
            }
            int temp=arr[minInd];
            arr[minInd]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static int[] selectionSort2(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int maxind=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[maxind])
                {
                    maxind=j;
                }
            }
            int temp=arr[maxind];
            arr[maxind]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
