class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        int res = 0;
        boolean odd = false;
        Object[] keys = map.keySet().toArray();
        for(int j = 0; j < map.size(); j++){
            char ch = (char) keys[j];
            int val = map.get(ch);
            if(val % 2 == 0){
                res = res + val;
            }else{
                res = res + val - 1;
                odd = true;
            }
        }
        if(odd == true){
            res++;
        }
        return res;
    }
}