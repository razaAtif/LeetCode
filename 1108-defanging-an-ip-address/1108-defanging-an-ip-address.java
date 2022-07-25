class Solution {
    public String defangIPaddr(String address) {
       StringBuilder sb = new StringBuilder();
       for (int i = 0; i < address.length(); i++) {
           if(address.charAt(i) == '.'){
               sb.append("[");
               sb.append(address.charAt(i));
               sb.append("]");
           }
           else{
               sb.append(address.charAt(i));
           }
       }
       return sb.toString();
    }
}
/*
  StringBuilder sb = new StringBuilder();
        
        sb.append(address);
        for(int i =0;i<address.length();i++){
            if(s.charAt(i) == '.'){
                sb.add(i-1,"[");
                sb.add(i+1,"]");
            }
        }
        return sb.toString();
*/