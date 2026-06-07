package CyclicSort;

public class Missingnumber2 {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int idx=nums[i];
            
            if(idx<nums.length-1 && nums[i]!=nums[idx])
            {
                int j=idx;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else{
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
