class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        
        while(s.length() > 0){
            if(s.length() == 1){
                sum += map.get(s.charAt(0));
                break;
            }
            if(map.get(s.charAt(1)) <= map.get(s.charAt(0))){
                sum += map.get(s.charAt(0));
                s = s.substring(1);
            }
            else {
                sum += map.get(s.charAt(1)) - map.get(s.charAt(0));
                s = s.substring(2);
            }
        }
        
        
        
        return sum;
    }
}