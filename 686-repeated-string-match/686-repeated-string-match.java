class Solution {
    public int repeatedStringMatch(String a, String b) {
      if(a.contains(b)) return  1;
        if(a.length() == 1 && b.charAt(0) != b.charAt(b.length()-1)) return -1;
        else if (a.length() == 1 && b.charAt(0) == b.charAt(b.length()-1))return b.length();
        int count = 1;
        String add = a;
        if(a.length() > b.length()){
            a = a + add;
            if(a.contains(b)) return 2;
            else return -1;
        }
        while(!a.contains(b) && a.length() < b.length()*2){
            a = a + add;
            count++;
            if(a.contains(b)) return count;
        }
        if(a.contains(b)) return count;
        return -1;
    }
}