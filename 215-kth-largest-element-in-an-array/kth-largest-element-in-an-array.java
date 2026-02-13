class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();

        for(int num : nums){
            pqueue.add(num);
            if(pqueue.size() > k){
                pqueue.poll();
            }
        }

        return pqueue.peek();
    }
}
