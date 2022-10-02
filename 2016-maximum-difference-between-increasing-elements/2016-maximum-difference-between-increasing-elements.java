class Solution {
    public int maximumDifference(int[] nums) {
        int max_diff = -1;
for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] > nums[i]){
                    int diff = nums[j] - nums[i];
                if(max_diff < diff){
                    max_diff = diff;
                } 
              }
            }
        }
        return max_diff;
    }
}