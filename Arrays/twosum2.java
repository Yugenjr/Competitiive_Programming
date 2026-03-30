class twosum {
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp=target-nums[i];  //remainder
            if(map.containsKey(comp))
            {
                return new int[] { mp.get(comp) , i};
            }
            mp.put(nums[i],i); //if not contains
        }
        return new int[]{ -1,-1};
    }
}