public class ReverseArray {
    public static void reverseArray(int[] arr) {
        // code here
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < arr.length / 2) {
            int temp=arr[lo];
            arr[lo]=arr[hi];
            arr[hi]=temp;
            lo+=1;
            hi-=1;
        }
    }
}