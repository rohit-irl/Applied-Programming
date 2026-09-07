class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        fun(n, n, "", ans);
        return ans;
    }
    public void fun(int ug, int pg, String temp, List<String> ans){
        if(ug == 0 && pg == 0){
            ans.add(temp);
            return;
        }
        if(ug > 0){
            fun(ug - 1, pg, temp + "(", ans);
        }
        if(pg > ug){
            fun(ug, pg - 1, temp + ")", ans);
        }
    }
}