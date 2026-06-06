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
            int size = end - st + 1; //how far we should go in next iteration
            st = end+1; 
            end = end + size * 2; //double the size we go from prev end.. or can use st-1 .
        }
        // or we can st=end and end=end*2; because we are doubling the size of window in each iteration and thus st will be end of previous window and end will be double of previous end.
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
//end may exceed the length of array but it will not throw error because we are not accessing end directly and we are using binary search in range st to end and thus it will work fine.
//time compexity is O(logn) and space complexity is O(1)