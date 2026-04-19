/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Node ptr = head;
        while (ptr != null) {
            map.put(ptr, new Node(ptr.val));
            ptr = ptr.next;
        }

        ptr = head;
        while (ptr != null) {
            Node newNode = map.get(ptr);
            newNode.next = map.get(ptr.next);
            newNode.random = map.get(ptr.random);
            ptr = ptr.next;
        }
        return map.get(head);
    }
}
/**
 * The New LinkedList Have Same Number Of Nodes
 * next And random pointer Should Point To New node On copied List
 * But Don't Any pointer On New List pointer To Original List
 * <p>
 * - We Must Recorde The Value Of List And The Random Pointer
 * And Don't Any Of Pointer Should point To Original List
 * <p>
 * - And Make New List And Iterative All The Recorde To New List
 * <p>
 * - First I Need To Know What Next For Every Node
 * <p>
 * - Second I Need To Know What The Random For Every Node
 * <p>
 * - Return The head Of The List
 *
 */