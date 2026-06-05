public class Swap {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        swap(arr,0,4);
    }
    static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        for (int n:arr)
            System.out.print(n+" ");
    }
}
