class Solution {
    public String reverseWords(String s) {
         s = s.trim();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();


        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                sb1.append(s.charAt(i));
            }
            else {
                sb1.reverse();
                sb1.append(' ');
                sb2.append(sb1);
                sb1.delete(0, sb1.length());
                while(s.charAt(i) == ' '){
                    i--;
                }
                i++;
            }
        }
        sb1.reverse();
        sb2.append(sb1);
        return sb2.toString();
    }
}