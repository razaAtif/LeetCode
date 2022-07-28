class Solution {
    public int nextGreaterElement(int n) {
        char num [] = (n + "").toCharArray();
        int i,j;
        for (i = num.length-1; i > 0 ; i--) {
            if(num[i-1] < num[i]){
                break;
            }
        }
        // it means the given number is largest
        if(i == 0) return -1;

        for (j = num.length-1; j > i ; j--) {
            if(num[i-1] < num[j]){
                break;
            }
        }
        char temp = num[i-1];
        num[i-1] = num[j];
        num[j] = temp;

        Arrays.sort(num,i,num.length);

        long val = Long.parseLong(new String(num));
        if(val <= Integer.MAX_VALUE){
            return (int) val;
        }
        return -1;

    }
}