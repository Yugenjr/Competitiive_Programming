public class Ceiling {
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int x=15;
        System.out.println(ceiling(arr,x));
    }
    public static int ceiling(int arr[],int x){
        int st=0;
        int end=arr.length-1;
        while(st<=end){  //st<end
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else{
                end=mid-1; //end=mid; 
            }
        }
        return end+1; // return st; 
        }
}

//if we use st<end in while loop , we have to return end=mid in else condition and return st at end of function because when loop breaks st and end are equal .