class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n){
        int close = n;
        int open = n;
        StringBuilder op = new StringBuilder();
        solve(close , open, op);

        return list;
    }

     private void solve (int close, int open, StringBuilder op){
        if(open == 0 && close == 0){
            list.add(op.toString());
            return;
        }


        if(open != 0){
            StringBuilder op1 = new StringBuilder(op);
            op1.append('(');
            solve(close , open-1 , op1);
        }

        if(close > open){
            StringBuilder op2 = new StringBuilder(op);
            op2.append(')');
            solve(close-1,open,op2);
        }

    }
}