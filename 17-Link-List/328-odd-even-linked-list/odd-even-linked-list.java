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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode con = even;
        while(even!=null && even.next!=null){
            odd.next = even.next; // isme mai 1 ko 3 se connect kr rha hu -1 
            odd = even.next; // odd will point to the 3
            even.next = odd.next;//connecting the 2 to 4 in first iteration
            even = even.next;
        }
        odd.next = con;
        return head;
    }
}