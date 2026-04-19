class Solution {
    ListNode ptr1;
    ListNode ptr2;
    public boolean hasCycle(ListNode head) {
        ptr1 = head;
        ptr2 = head;
        if(ptr2 == null || ptr2.next == null || ptr2.next.next == null)
        {
            return false;
        }
while (ptr2 != null && ptr2.next != null)

        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2)
            {
                return  true;
            }
        }
        return false;
    }
}
