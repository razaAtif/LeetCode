class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
        int l = s.length();
        if (s.charAt(l - 1) != '0') return false;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        for (int i = 1; i < l; i++) {
            if(s.charAt(i) == '0'){
                while(!queue.isEmpty() && queue.peek() < i-maxJump)
                    queue.poll();

                if(queue.isEmpty()) return false;
                int prev = queue.peek();
                if(prev+minJump <= i && prev+maxJump>=i){
                    queue.offer(i);
                    if(s.length()-1 == i) return true;
                }
            }
        }
        return false;
    }
}