/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;//maintain a dummynode for the slow 
        ListNode fast = dummy;//maintain a dummynode for the fast
        for(int i =0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;//moving slow to one step
            fast = fast.next;//moving fast to one fast
        }
        slow.next = slow.next.next;//move the slow to the next twp step
        return dummy.next;
    }
}