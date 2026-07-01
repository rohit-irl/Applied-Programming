class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int res[] = new int[m + n];
        while(i < m && j < n){
            if(nums1[i] <= nums2[j]){
                res[k] = nums1[i];
                k++;
                i++;
            }else{
                res[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(j < n){
            res[k] = nums2[j];
            k++;
            j++;
        }
        while(i < m){
            res[k] = nums1[i];
            k++;
            i++;
        }
        for(int x = 0; x < m+n; x++){
            nums1[x] = res[x];
        }
    }
}