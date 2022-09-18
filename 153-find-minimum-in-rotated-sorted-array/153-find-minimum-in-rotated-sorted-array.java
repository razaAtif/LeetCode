class Solution {
    public int findMin(int[] nums) {
        int start  = 0;
       int end = nums.length-1;
       int n = nums.length;

       if(nums[start] < nums[end]){
           return nums[start];
       }

       if(nums.length == 1){
           return nums[0];
       }

       while(start < end){
           int mid = start + (end - start) / 2;
           
           if(mid+1 < n && nums[mid] > nums[mid+1]){
               return nums[mid+1];
           }
           else if(mid-1 >= 0 && mid+1 < n && nums[mid] < nums[mid-1] && nums[mid] < nums[mid+1]){
               return nums[mid];
           }
           else if(nums[mid] > nums[0]){
              start = mid+1;
           }
           else if(nums[mid] < nums[0]){
               end = mid-1;
           }
       }
       return -1;
    }
}