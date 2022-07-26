class Solution {
    public int numWays(String s) {
        
         long NoOfOnes = 0;
        long modulo = 1_000_000_00_7;;
        long ways_one = 0;
        long ways_two = 0;
        long count_ones = 0;
        long n = s.length();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                NoOfOnes++;
            }
        }
        if(NoOfOnes % 3 != 0) return 0;
        if(NoOfOnes == 0){
            return (int) (((n-1) * (n-2) / 2) % modulo);
        }
        long one_third = NoOfOnes/3;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                count_ones++;
            }
            if(count_ones == one_third){
                ways_one++;
            }
            else if(count_ones == 2*one_third){
                ways_two++;
            }
        }
        return(int) ((ways_one * ways_two) % modulo);
    }
}