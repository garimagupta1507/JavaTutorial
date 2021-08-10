public class Queue {
    private ListNode head;

    public void push(int element) {
        ListNode temp = new ListNode();
        temp.val = element;
        temp.next = head;
        head = temp;
    }
    public int pop(){
        if(head == null) return -1;

        if(head.next == null){
            int value = head.val;
            head = null;
            return value;
        }

        ListNode tmp = head;
        while (tmp.next.next != null){
            tmp = tmp.next;
        }
        int value = tmp.next.val;
        tmp.next = null;
        return value;

    }
    public int peek(){
        if(head == null) return -1;
        ListNode tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.val;
    }

}


