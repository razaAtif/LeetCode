class Solution {
    class Pair{
        int freq;
        int num;

        Pair(int freq, int num){
            this.freq = freq;
            this.num = num;
        }
    }
    public  int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 1);
            }
            else {
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
        }
        PriorityQueue<Pair> minHeap = new PriorityQueue<>
            ((o1,o2) -> (o1.freq - o2.freq));

        for(int key : map.keySet()){
            minHeap.add(new Pair(map.get(key), key));
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int [] res = new int[k];
        int i = 0;
        while(minHeap.size() > 0){
            res[i] = minHeap.peek().num;
            minHeap.poll();
            i++;
        }

        return res;
    }
}