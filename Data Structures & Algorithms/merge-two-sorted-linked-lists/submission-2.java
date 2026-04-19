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
    public ListNode MergeNode;
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        MergeNode = new ListNode();
        ListNode head = MergeNode;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        if(ptr1 == null & ptr2 == null)
        {
            head = null;
            return head;
        }
        while (ptr1 != null && ptr2 != null) { 
            if(ptr1.val < ptr2.val)
            {
                MergeNode.val = ptr1.val;
                ptr1 = ptr1.next;
            }
            else{
                MergeNode.val = ptr2.val;
                ptr2 = ptr2.next;
            }

            if(ptr1 != null || ptr2 != null)
            {
                MergeNode.next = new ListNode();
                MergeNode = MergeNode.next;
            }
        }
        while(ptr1 != null)
        {
            MergeNode.val = ptr1.val;
            ptr1 = ptr1.next;
            if(ptr1 != null)
            {
                MergeNode.next = new ListNode();
                MergeNode = MergeNode.next;
            }
        }
        
        while(ptr2 != null)
        {
            MergeNode.val = ptr2.val;
            ptr2 = ptr2.next;
            if(ptr2 != null)
            {
                MergeNode.next = new ListNode();
                MergeNode = MergeNode.next;
            }
        }
        return head;
    }
}