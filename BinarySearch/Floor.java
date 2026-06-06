public class Floor {
    
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int x=15;
        System.out.println(floor(arr,x));
    }
    public static int floor(int arr[],int x){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;  //st=end+1 and thus end=st-1; 
    }
}
