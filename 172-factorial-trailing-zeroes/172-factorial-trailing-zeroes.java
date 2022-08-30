class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        int base = 5;
        while(true){
            count += n / base;
            if(n / base == 0) break;
            base = base * 5;
        }
        return count;
    }
}