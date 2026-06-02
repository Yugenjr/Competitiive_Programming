class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Integer value : map.values())
        {
            if(value>1)
            {
                return true;
            }
        }
        return false;
    }
}