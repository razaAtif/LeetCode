class Solution {
    public int myAtoi(String s) {
     StringBuilder sb= new StringBuilder();
        s = s.trim();

        if(s.length() == 0) return 0;

        long val = 0;
        int sign = 1;
        int start = 0;
        char first_char = s.charAt(0);

        if(first_char == '+'){
            start++;
        }
        if(first_char == '-'){
            sign = -1;
            start++;
        }

        for (int i = start; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return (int)val * sign;
            }
            val = val * 10 + s.charAt(i) - '0';
            if(val > Integer.MAX_VALUE && sign == 1){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && (-1) * val < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int) val * sign;
    }
}