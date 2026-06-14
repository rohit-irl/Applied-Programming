class Solution {
    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverse(slow);
        ListNode first = head;
        int max = 0;

        while (second != null) {
            int sum = first.val + second.val;
            max = Math.max(max, sum);
            first = first.next;
            second = second.next;
        }
        return max;
    }


    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}