class Solution {
    public int kthFactor(int n, int k) {
         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                maxHeap.add(i);
                if(maxHeap.size() > k){
                    maxHeap.poll();
                }
            }
        }
        if(maxHeap.size() == k) return maxHeap.peek();

        return -1;
    }
}