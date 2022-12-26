public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = null, fast = head;
        while (fast != null && fast.next != null && slow != fast) {
            slow = slow == null ? fast : slow.next;
            fast = fast.next.next;
        }
        return (slow != null && fast != null) && slow == fast;
    }
}
