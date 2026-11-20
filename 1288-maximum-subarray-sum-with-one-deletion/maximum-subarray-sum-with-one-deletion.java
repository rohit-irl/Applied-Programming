class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int onedelete = Integer.MIN_VALUE;
        int nodelete = arr[0];
        int res = arr[0];
        for(int i = 1; i < n; i++){
            int prevonedelete = onedelete;
            int prevnodelete = nodelete;
            nodelete = Math.max(nodelete + arr[i] , arr[i]);
            int v2;
            if(onedelete == Integer.MIN_VALUE){
                v2 = arr[i];
            }else{
                v2 = prevonedelete + arr[i];
            }
            onedelete = Math.max(v2, prevnodelete);
            res = Math.max(res, Math.max(onedelete, nodelete));
        }
        return res;
    }
}