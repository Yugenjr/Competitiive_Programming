package CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    
public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int idx=nums[i]-1;
            
            if(nums[i]!=nums[idx])
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
        ArrayList<Integer> ans=new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1) {
                ans.add(i+1);
            }
        }
        return ans;
    }
}
