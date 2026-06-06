public class SearchinRotated {
    public int search(int[] nums, int target) {
        int piv= pivot(nums);
        int firsthalf=binarysearch(0,piv,nums,target);
        if(firsthalf!=-1)
        {
            return firsthalf;
        }
        return binarysearch(piv+1,nums.length-1,nums,target);
    }
    public int pivot(int arr[]) {
        int st=0;
        int en=arr.length-1;
        while(st<=en)
        {
            int mid=st+(en-st)/2;
            if (arr[mid] >= arr[0]) {
                st = mid + 1;
            } 
            else {
                en = mid - 1;
            }
        }
        return st-1;
    }
    public int binarysearch(int st,int en,int[] arr,int target)
    {
        while(st<=en)
        {
            int mid=st+(en-st)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                en=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return -1;
    }
}