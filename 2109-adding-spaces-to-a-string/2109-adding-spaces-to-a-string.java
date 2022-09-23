class Solution {
    StringBuilder sb = new StringBuilder();
    
    public String addSpaces(String s, int[] spaces) {
        if(spaces.length == 0) return s;

        int start = 0;
        int end = 1;

        sb.append(s.substring(0,spaces[0]));
        sb.append(" ");

        final_String(s,spaces,start,end);

        return sb.toString();
    }
     private void final_String(String s, int [] spaces, int start, int end){
        if(end >= spaces.length){
           sb.append(s.substring(spaces[start]));
           return;
        }
         
        sb.append(s.substring(spaces[start],spaces[end]));
        sb.append(" ");
        start++;
        end++;

        final_String(s,spaces,start,end);
     }
}