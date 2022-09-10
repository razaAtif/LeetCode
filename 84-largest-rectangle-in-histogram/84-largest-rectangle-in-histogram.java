class Solution {
    static class Pair{
        int value;
        int index;
        
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> st = new Stack<>();
        int n = heights.length;
        int [] width = new int [n];
        int [] area = new int [n];
        int max = Integer.MIN_VALUE;
        
        int [] nsl = NSL(heights);
        int [] nsr = NSR(heights);
        
        for(int i = 0; i < n; i++){
            width[i] = nsr[i] - nsl[i] - 1;
        }
        for(int i = 0; i < n; i++){
            area[i] = width[i] * heights[i];
        }
        for(int i = 0; i< n; i++){
            max = Math.max(max,area[i]);
        }
        return max;
    }
    static int[] NSL(int[] nsl){
        int [] res = new int[nsl.length];
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < nsl.length; i++){
            if(st.isEmpty()){
                res[i] = -1;
            }
            else if(!st.isEmpty() && nsl[i] > st.peek().value){
                res[i] = st.peek().index;
            }
            else if(!st.isEmpty() && nsl[i] <= st.peek().value){
                while(!st.isEmpty() && nsl[i] <= st.peek().value){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i] = -1;
                }
                else{
                    res[i] = st.peek().index;
                }
            }
            st.push(new Pair(nsl[i],i));
        }
        return res;
    }
     static int[] NSR(int[] nsr){
        int [] res = new int[nsr.length];
        Stack<Pair> st = new Stack<>();
        for(int i = nsr.length-1; i >= 0; i--){
            if(st.isEmpty()){
                res[i] = nsr.length;
            }
            else if(!st.isEmpty() && nsr[i] > st.peek().value){
                res[i] = st.peek().index;
            }
            else if(!st.isEmpty() && nsr[i] <= st.peek().value){
                while(!st.isEmpty() && nsr[i] <= st.peek().value){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i] = nsr.length;
                }
                else{
                    res[i] = st.peek().index;
                }
            }
            st.push(new Pair(nsr[i],i));
        }
        return res;
    }
}