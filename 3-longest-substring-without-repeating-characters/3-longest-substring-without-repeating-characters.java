class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new LinkedHashSet<>();
      int st = 0;
      int e = 0;
      int max = 0;

      while(e < s.length()){
          if(!set.contains(s.charAt(e))){
              set.add(s.charAt(e));
              e++;
              max = Math.max(max, set.size());
          }
          else {
              while(s.charAt(st) != s.charAt(e)){
                  set.remove(s.charAt(st));
                  st++;
              }
              set.remove(s.charAt(st));
              st++;
          }
      }
      return max;
    }
}