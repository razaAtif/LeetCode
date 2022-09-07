class Solution {
    public int[] nextGreaterElements(int[] nums) {
          int [] res = new int [nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = nums.length-1; i >= 0 ; i--) {
            st.push(i);
        }
        for (int i = nums.length-1; i >= 0 ; i--) {
            res[i] = -1;
           while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
               st.pop();
           }
           if(!st.isEmpty()){
               res[i] = nums[st.peek()];
           }
           st.push(i);
        }
        return res;
    }
}