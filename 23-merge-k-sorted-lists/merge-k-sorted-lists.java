import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for(ListNode l : lists)
            while(l != null){
                arr.add(l.val);
                l = l.next;
            }
        Collections.sort(arr);
        ListNode dummy = new ListNode(0), curr = dummy;
        for(int x : arr){
            curr.next = new ListNode(x);
            curr = curr.next;
        }
        return dummy.next;
    }
}