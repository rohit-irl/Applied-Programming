class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;
        int count1 = 0;
        int count2 = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                if (i < mid) {
                    count1++;
                } else {
                    count2++;
                }
            }
        }
        return count1 == count2;
    }
}
