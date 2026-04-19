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
    public ListNode ptr;
    Stack<Integer> result = new Stack<>();
    public ListNode reverseList(ListNode head) {
        ptr = head;
        while(ptr != null)
        {
            result.add(ptr.val);
            ptr = ptr.next;
        }
        ptr = head;
        while (ptr != null)
        {
            ptr.val = result.pop();
            ptr = ptr.next;
        } 
        ptr = head;
        return ptr;
    }
}