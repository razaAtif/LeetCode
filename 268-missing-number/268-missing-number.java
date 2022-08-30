class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length + 1;
        sum = n * (n+1) / 2;
        int nums_sum = 0;
        for(int i = 0; i < nums.length; i++){
           nums[i] = nums[i] + 1;
        }
        for(int i = 0; i < nums.length; i++){
            nums_sum += nums[i];
        }
        return (sum - nums_sum - 1);
        
    }
}