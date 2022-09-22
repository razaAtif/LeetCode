class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
       res = new ArrayList<>();
       if(nums.length == 0){
           return res;
       }
       subset(nums, new ArrayList<Integer>(), 0); 
       return res; 
    }
    
    private void subset(int [] nums, ArrayList<Integer> temp, int index){
        if(index >= nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[index]);
        subset(nums, temp, index+1);
        temp.remove(temp.size()-1);
        
        subset(nums,temp,index+1);
    }
}