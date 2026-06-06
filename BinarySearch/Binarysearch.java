class Binarysearch{
    static int binarySearchasc(int arr[], int x) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return -1;
}

    static int binarySearchdesc(int arr[], int x) {
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<x){
                end=mid-1;
            }
            else if(arr[mid]>x){
                st=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int orderagnosticbs(int arr[], int x) {
        int st=0;
        int end=arr.length-1;
        boolean isasc=arr[st]<arr[end];
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(isasc){
                if(arr[mid]>x){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
            else{
                if(arr[mid]<x){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int x=6;
        int result1=binarySearchasc(arr, x);
        int result2=binarySearchdesc(arr, x);
        int result3=orderagnosticbs(arr, x);
        if(result1==-1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: "+result1);
        }
        if(result2==-1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: "+result2);
        }
        if(result3==-1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index: "+result3);
        }
    }
}