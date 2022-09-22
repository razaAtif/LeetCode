class Solution {
    public String reverseWords(String s) {
        
    char[] str = s.toCharArray();

     int i = 0;
     int j = 0;

     int n = str.length;

     while(j < n){
         if(str[j] == ' '){
             Reverse_word(str, i , j-1);
             i = j+1;
         }
         j++;
     }
     Reverse_word(str,i,j-1);
     return new String(str);

    }

     static void Reverse_word(char[] str, int i, int j) {
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }

}
}