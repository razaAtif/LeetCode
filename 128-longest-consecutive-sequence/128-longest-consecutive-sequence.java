class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0;
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] == 1){
                count++;
                if(max < count){
                    max = count;
                }
            }
            else if(nums[i] - nums[i-1] == 0){
                continue;
            }
            else {
                count = 1;
            }

        }
        return max;
    }
}