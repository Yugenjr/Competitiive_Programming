public class FirstandLast {  

    public int[] searchRange(int[] nums, int target) {
        int first = search(nums, target, true);
        int last = search(nums, target, false);

        return new int[]{first, last};
    }

    public int search(int[] nums, int target, boolean firstOcc) {
        int st = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (nums[mid] < target) {
                st = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;

           //core answer lies on here !     
                if (firstOcc) {
                    end = mid - 1; // search left
                } else {
                    st = mid + 1;  // search right
                }
           //to find start , go left and to find end , go right

            }
        }
        return ans;
    }
}