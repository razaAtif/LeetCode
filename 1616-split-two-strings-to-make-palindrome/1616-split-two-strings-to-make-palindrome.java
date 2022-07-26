class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
         return check(a,b) || check(b,a);
    }

    static boolean check (String a, String b){
        int left = 0; int right = a.length()-1;
        while(left < right && a.charAt(left) == b.charAt(right)){
            left++;
            right--;
        }
        if(left >= right) return true;
        return isPallindrome(a,left,right) || isPallindrome(b,left,right);
   }

   static boolean isPallindrome (String s, int left, int right) {
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}