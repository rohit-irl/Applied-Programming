class Solution {
    public int maxNumberOfBalloons(String text) {
        int n = text.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = text.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);
        int count = Integer.MAX_VALUE;
        Object[] keys = need.keySet().toArray();
        for(int j = 0; j < need.size(); j++){
            char ch = (char) keys[j];
            int fneed = need.get(ch);
            int fhave = map.getOrDefault(ch, 0);
            int times = fhave / fneed;
            count = Math.min(times, count);
        }
        return count;
    }
}