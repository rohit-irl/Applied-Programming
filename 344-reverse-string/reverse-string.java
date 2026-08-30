class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    public void reverse(char[] s, int low, int high){
        if(low >= high){
            return;
        }
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        reverse(s, low + 1, high - 1);
    }
}