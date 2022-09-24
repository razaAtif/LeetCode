class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, ans, index);
        
        return ans;
    }
    private void solve (int [] nums, List<List<Integer>> ans,  int index){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            
            ans.add(list);
            return;
        }
        
        for(int i = index; i < nums.length; i++){
            swap(nums, i, index);
            solve(nums,ans,index+1);
            swap(nums,i,index);
        }
    }
    
    private void swap(int [] nums, int i, int index){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
        return;
    }
}