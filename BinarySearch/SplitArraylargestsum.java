public class SplitArraylargestsum {
    public int splitArray(int[] nums, int m) {
        int st=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            st=Math.max(st, nums[i]);
            end+=nums[i];
        }
        while(st<end)
        {
            //try for mid
            int mid=st+(end-st)/2;
            //calculate how many pieces you can divide this array into with this mid as max sum
            int pieces=1;
            int sum=0;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    //you cannot add this in this subarray , make new one
                    pieces++;
                    //say you add this num in new subarray , then sum=num;
                    sum=num;
                }
                else
                {
                    sum+=num;
                }
            }
            if(pieces<=m)
            {
                end=mid;
            }
            else
            {
                st=mid+1;
            }
        }
        return st;
    }
        
}
