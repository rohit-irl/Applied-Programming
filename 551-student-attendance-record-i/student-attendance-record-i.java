class Solution {
    public boolean checkRecord(String s) {
        int A = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                A++;
            }
            if(A >= 2){
                return false;
            }
            if(s.contains("LLL")){
                return false;
            }
        }
        return true;
    }
}