class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put((long)num,
            map.getOrDefault((long)num,0)+1);
        }
        int ans = 1;
        for(long x : map.keySet()){
            if(x == 1){
                int count = map.get(x);
                if(count % 2 == 0)
                    count--;
                ans = Math.max(ans, count);
                continue;
            }
            int len = 0;
            long curr = x;
            while(map.containsKey(curr) && map.get(curr) >= 2){
                len += 2;
                curr = curr * curr;
                if(curr > 1e9)
                    break;
            }
            if(map.containsKey(curr)){
                len++;
            }
            if(len % 2 == 0)
                len--;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}