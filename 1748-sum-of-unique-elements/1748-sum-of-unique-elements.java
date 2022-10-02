class Solution {
    public int sumOfUnique(int[] nums) {
         int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }
}