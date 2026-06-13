class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder(words.length);
        for (String word : words) {
            int sum = 0;

            for (int i = 0; i < word.length(); i++) {
                sum += weights[word.charAt(i) - 'a'];
            }
            ans.append((char)('a' + (25 - (sum % 26))));
        }
        return ans.toString();
    }
}