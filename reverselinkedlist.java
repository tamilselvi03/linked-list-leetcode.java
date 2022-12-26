class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode temp = head.next;
        head.next = null;
        while(temp!=null){
            ListNode t = temp.next;
            temp.next = head;
            head = temp;
            temp = t;
        }
        return head;
    }
}
