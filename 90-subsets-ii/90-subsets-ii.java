class Solution {
    List<List<Integer>> res;
     Set<ArrayList<Integer>> set = new LinkedHashSet<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        res = new ArrayList<>();
        
        if(nums.length == 0){
            return res;
        }
        
        subset(nums, new ArrayList<Integer>(), 0);
        return res;
    }
    
    private void subset(int [] nums, ArrayList<Integer>temp, int index){
        if(index >= nums.length){
            if(!set.contains(new ArrayList<>(temp))){
                set.add(new ArrayList<>(temp));
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        
        subset(nums, temp, index+1);
        
        temp.add(nums[index]);
        subset(nums, temp, index+1);
        temp.remove(temp.size()-1);
        
        
    }
}