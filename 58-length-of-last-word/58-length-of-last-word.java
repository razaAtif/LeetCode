class Solution {
    public int lengthOfLastWord(String s) {
        
         StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0){
         if(s.charAt(i) == ' ' && sb.isEmpty()){
             i--;
         }
         else if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
                i--;
            }
            else break;
        }
        return sb.length();
    }
}