class Solution {
  class Pair {
        int freq;
        int num;

        Pair(int freq, int num){
            this.freq = freq;
            this.num = num;
        }
    }

    public  int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o2.freq - o1.freq == 0){
                    return o2.num - o1.num;
                }
                return o1.freq - o2.freq;
            }
        });

        for (int key : map.keySet()){
            minHeap.add(new Pair(map.get(key) , key));
        }

        int [] res = new int[nums.length];
        int i = 0;
        while(minHeap.size() > 0){
           int freq = minHeap.peek().freq;
           int value = minHeap.peek().num;

            for (int j = 1; j <= freq; j++) {
                res[i] = value;
                i++;
            }
            minHeap.poll();
        }

        return res;
    }
}