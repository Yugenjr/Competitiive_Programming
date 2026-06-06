public class NoOfRotationsinSortedarray {
        public static void main(String[] args) {
        int[]arr={3,4,5,6,7,1,2}; //2>=6 XX
        System.out.println(bs(arr));
    }
    public static int bs(int[]arr)
    {
        int[]arr2={6,7,1,2,3,4,5}; //6>=3 
        int st=0; int en=arr.length-1;
        while(st<=en)
        {
            
            int mid=st+(en-st)/2;
            if(arr[st]<=arr[en])
            {
                return st;
            }
            if(mid > st && arr[mid]<arr[mid-1] )
            {
                return mid;
            }
            if(mid < en && arr[mid]>arr[mid+1])
            {
                return mid+1;
            }
            if(arr[st]>=arr[mid])
            {
                en=mid-1;
            }
            else
            {
                st=mid+1;
            }
            
        }
        return 0;
    }
}