class Solution {
      class Pair{
        int key;
        int value;

        Pair(int key, int value){
            this.key = key;
            this.value  = value;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(
                new Comparator<Pair>(){
                    public int compare(Pair a, Pair b){
                        // if both the keys are same then compare on the bases of their values
                        if((b.key - a.key) == 0)
                            return b.value - a.value;
                        return b.key - a.key;
                    }
                });

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            maxHeap.add(new Pair(diff, arr[i]));
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        while(!maxHeap.isEmpty()){
            list.add(maxHeap.peek().value);
            maxHeap.poll();
        }
        Collections.sort(list);
        return list;
    }

}