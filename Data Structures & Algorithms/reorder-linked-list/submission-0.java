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
    public void reorderList(ListNode head) {
        ptr = head;
        ArrayList<Integer> array = new ArrayList<>();
        while(ptr != null)
        {
            array.add(ptr.val);
            ptr = ptr.next;
        }
        int i = 0;
        int j = array.size() - 1;
        ptr = head;
        while(i < j)
        {
            ptr.val = array.get(i);
            ptr = ptr.next;
            ptr.val = array.get(j);
            ptr = ptr.next;
            i++;
            j--;
        }
        if (i == j) {
            ptr.val = array.get(i);
        }
    }
}
