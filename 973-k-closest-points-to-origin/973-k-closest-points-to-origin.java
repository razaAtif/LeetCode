class Solution {
   class Pair {
        int dist;
        int [] cord;

        Pair(int dist, int [] cord){
            this.dist = dist;
            this.cord = cord;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.dist - o1.dist;
            }
        });
        int [][] res = new int[k][2];

        for (int i = 0; i < points.length; i++) {
            maxHeap.add(new Pair(points[i][0] * points[i][0] + points[i][1] * points[i][1],
                    new int[]{points[i][0],points[i][1]}));

            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        while(!maxHeap.isEmpty()){
            for (int i = 0; i < k; i++) {
                res[i][0] = maxHeap.peek().cord[0];
                res[i][1] = maxHeap.peek().cord[1];
                maxHeap.poll();
            }
           
        }
        return res;
    }
}