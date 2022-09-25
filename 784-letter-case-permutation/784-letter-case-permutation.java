class Solution {
    List<String> list = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
       StringBuilder op = new StringBuilder();

        solve(s,op);

        return list;
    }

    private void solve (String s, StringBuilder op){
        if(s.length() == 0){
            list.add(op.toString());
            return;
        }

        if(Character.isDigit(s.charAt(0))){
            StringBuilder op1 = new StringBuilder(op);
            op1.append(s.charAt(0));
            s = s.substring(1);
            solve(s, op1);
        }
        else {
            StringBuilder op1 = new StringBuilder(op);
            StringBuilder op2 = new StringBuilder(op);

            op1.append(Character.toLowerCase(s.charAt(0)));
            op2.append(Character.toUpperCase(s.charAt(0)));

            s = s.substring(1);
            solve(s,op1);
            solve(s,op2);
        }
    }
}