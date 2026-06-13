class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder(words.length);
        for (String word : words) {
            int sum = 0;

            for (int i = 0, n = word.length(); i < n; i++) {
                sum += weights[word.charAt(i) - 97];
            }
            sb.append((char)(122 - (sum % 26)));
        }
        return sb.toString();
    }
}