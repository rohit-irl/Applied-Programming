class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        int arr[] = new int[26];
        if(sl != tl){
            return false;
        }
        for(int i = 0; i < sl; i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < tl; i++){
            arr[t.charAt(i) - 'a']--;
            if(arr[t.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}