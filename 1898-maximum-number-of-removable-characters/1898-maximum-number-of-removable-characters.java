class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
      int left = 0;
      int right = removable.length;
      char [] letters = s.toCharArray();
      while(left <= right){
           int mid = left + (right - left) / 2;
          for (int i = 0; i < mid; i++) {
              letters[removable[i]] = '?';
          }
          if(check(letters,p)){
              left = mid + 1;
          }
          else {
              for (int i = 0; i < mid; i++) {
                  letters[removable[i]] = s.charAt(removable[i]);
              }
              right = mid - 1;
          }
      }
      return right;
    }
   public boolean check (char[]letters,String p){
        int l1 = 0; int p1 = 0;
       while(l1 < letters.length && p1 < p.length()){
           if(letters[l1] != '?' && letters[l1] == p.charAt(p1)){
               l1++;
               p1++;
           }
           else l1++;
       }
       if(p1 == p.length()){
           return true;
       }
       return false;
    }
}