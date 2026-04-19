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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>(); ListNode ptr = head; int size = 0; while (ptr != null) { size++; ptr = ptr.next; } ptr = head; for (int i = 0; i < size / 2; i++) { stack.push(ptr.val); ptr = ptr.next; } if (size % 2 == 1) { ptr = ptr.next; } while (ptr != null) { if (stack.pop() != ptr.val) { return false; } ptr = ptr.next; } return true;
    }
}