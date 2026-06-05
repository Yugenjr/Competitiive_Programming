import java.util.*;
class Containsduplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> se=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(se.containsKey(n))
            {
                if(i-se.get(n)<=k)
                {
                    return true;
                }
            }
            se.put(n,i);
        }
        return false;
    }
}

