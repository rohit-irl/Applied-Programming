class Solution {

    public void swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void flip(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i += 2 * k) {
            int end = Math.min(i + k - 1, arr.length - 1);
            flip(arr, i, end);
        }
        return new String(arr);
    }
}