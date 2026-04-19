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
    public ListNode slow, fast;
    public ListNode ptr;
    public int i;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ptr = head;
        slow = head;
        fast = head;   
        i = 0;
        while (i < n) {
            fast = fast.next;
            i++;
        }

      
        if (fast == null) {
            return ptr.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return ptr;
    }
}