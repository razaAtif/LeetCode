class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> set = new LinkedHashSet<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0){
            return ans;
        }
        Arrays.sort(nums);
        int index = 0;
        solve (nums, index);

        return ans;
    }

    private void solve (int [] nums,  int index){
        if(index == nums.length){

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }

            if(!set.contains(list)){
                set.add(list);
                ans.add(list);
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(i , index, nums);
            solve(nums,  index+1);
            swap(i , index, nums);
        }
    }
    private void swap (int i, int index, int [] nums){
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }

}