class Solution {
    public int reverse(int x) {
       
        StringBuilder sb = new StringBuilder();
        
        String s = String.valueOf(x);
        
        if(s.charAt(0) == '-'){
            sb.append('-');
        }
        
        
        int end = s.length()-1;
        while(end >= 0 && s.charAt(end) == '0' ){
            end--;
        }
        
        if(end < 0){
            return 0;
        }
        
        while(end >= 0 && s.charAt(end) != '-'){
            sb.append(s.charAt(end));
            end--;
        }
        String res = sb.toString();
        long num = Long.parseLong(res); 
         if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
            return 0;
        }
        
        return (int)num;
    }
}