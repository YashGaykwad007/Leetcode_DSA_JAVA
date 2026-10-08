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
    public ListNode swapPairs(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while(current!=null && current.next!=null){
            ListNode second = current.next;
            current.next = second.next;
            second.next = current;
            if(prev==null){
                head = second;
            }
            else{
                prev.next = second;

            }
            prev = current;
            current = current.next;
        }
        return head;
        
    }
}