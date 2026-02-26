class Solution {
    public String removeDuplicates(String s) {
        StringBuilder dabba = new StringBuilder();
        for(char c : s.toCharArray()){
            if(dabba.length() > 0 && dabba.charAt(dabba.length()-1) == c){
                dabba.deleteCharAt(dabba.length()-1);
            } else {
                dabba.append(c);
            }
        }
        return dabba.toString();
    }
}