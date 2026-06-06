public class PosinInfinitearray {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,10,90,100,130,140,160,170};
        int x=10;
        System.out.println(posinfinitearray(arr,x));
    }
    static int posinfinitearray(int arr[], int x) {
        int st=0;
        int end=1;
        while(x>arr[end]){
            st=end;
            end=end*2;
        }
        return binarysearch(arr,x,st,end);
    }
    static int binarysearch(int arr[], int x, int st, int end) {
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
}
}
