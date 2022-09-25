class Solution {
    List<String> list = new ArrayList<>();
    Set<String> set = new LinkedHashSet<>();
    
    public List<String> letterCasePermutation(String s) {
       StringBuilder op = new StringBuilder();

        solve(s,op);

        return list;
    }

    private void solve (String s, StringBuilder op){
        if(s.length() == 0){
            if(!set.contains(op.toString())){
                set.add(op.toString());
                list.add(op.toString());
            }
            return;
        }

        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);


        if(Character.isDigit(s.charAt(0))){
            op1.append(s.charAt(0));
            op2.append(s.charAt(0));
        }
        else if(Character.isLowerCase(s.charAt(0))){
            op1.append(s.charAt(0));
            op2.append(Character.toUpperCase(s.charAt(0)));
        }
        else if(Character.isUpperCase(s.charAt(0))){
            op1.append(Character.toLowerCase(s.charAt(0)));
            op2.append(s.charAt(0));
        }

        s = s.substring(1);

        solve(s,op1);
        solve(s,op2);
    }
}