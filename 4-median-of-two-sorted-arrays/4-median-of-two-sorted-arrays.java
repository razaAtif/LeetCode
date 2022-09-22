class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < nums1.length; i++){
            minHeap.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            minHeap.add(nums2[i]);
        }
        
        if(minHeap.size() % 2 != 0){
            int k = (minHeap.size() / 2) + 1;
            while(k != 1){
                minHeap.poll();
                k--;
            }
            return (double)(minHeap.peek());
        }
        else {
            int k = (minHeap.size() / 2) ;
           
            while(k != 1){
                minHeap.poll();
                k--;
            }
            double a = (double)minHeap.poll();
            double b = (double)minHeap.poll();
            
            double med = (b + a ) / 2;
            return med;
        }
        
    }
}