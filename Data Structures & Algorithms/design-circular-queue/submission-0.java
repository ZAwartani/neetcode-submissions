class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MyCircularQueue {
    public ListNode Front;
    public ListNode Rear;
    public int size;
    public MyCircularQueue(int k) {
        this.Front = null;
        this.Rear = null;
        this.size = k;
    }
    
    public boolean enQueue(int value) {
        boolean result = true;
        ListNode node = new ListNode(value);    
        if(isEmpty() && size > 0){
            Front = node;
            Rear = node;         
            size--;
            return result;
        }else if(!isFull()){
            Rear.next = node;
            Rear = node;
            Rear.next = Front;
            size--;
            return result;
        }else{
            result = false;
            return result;
        }
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (Front == Rear) {
            Front = null;
            Rear = null;
        } else {
            Front = Front.next;
            Rear.next = Front;
        }

    size++;
    return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }else{
            return Front.val;
        }
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }else{
            return Rear.val;
        }
    }
    
    public boolean isEmpty() {
        return Front == null && Rear == null;
    }
    
    public boolean isFull() {
        return size == 0;
    }
}