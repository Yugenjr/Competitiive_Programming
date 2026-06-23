package BinarySearch;
class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public int bs(int[] nums, int st,int en,int target)
    {
        if(st<=en)
        {
        int mid=st+(en-st)/2;
        if (nums[mid]==target)
        {
            return mid;
        }
        else if(target>nums[mid])
        {
            return bs(nums,mid+1,en,target);
        }
        else
        {
            return bs(nums,st,mid-1,target);
        }
        }
        else
        {
            return st;
        }
    }
}