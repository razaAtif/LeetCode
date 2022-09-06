class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int [] res = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = nums2.length-1; i >= 0 ; i--) {
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }
            else if(!st.isEmpty() && st.peek() > nums2[i]){
                map.put(nums2[i] , st.peek());
            }
            else if(!st.isEmpty() && st.peek() <= nums2[i]){
                while(!st.isEmpty() && st.peek() <= nums2[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    map.put(nums2[i] , -1);
                }
                else {
                    map.put(nums2[i] , st.peek());
                }
            }
             st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            if(map.containsKey(nums1[i])){
                res[i] = map.get(nums1[i]);
            }
        }
        return res;
    }
}