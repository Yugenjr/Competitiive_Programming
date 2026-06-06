public class PeakofBitonicArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 8, 12, 4, 2};
        System.out.println(peak(arr));
    }
    public static int peak(int arr[]) {
        int st=0;
        int en=arr.length-1;
        while(st<en)
        {
            int mid=st+(en-st)/2;
            if(arr[mid]>arr[mid+1]){
                en=mid;
            }
            else{
                st=mid+1;
            }   
        }
        return st;
    }
    
}
