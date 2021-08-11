public class Stack {
    ListNode head ;

    public Stack(){
        head = null;
    }

    public void push(int element){
        ListNode tmp = new ListNode();
        tmp.val = element;
        tmp.next = head;
        head = tmp;
    }

    public int pop(){
        if(head == null){
            return -1;
        }
        int tmpVal;
        tmpVal = head.val;
        head = head.next;
        return tmpVal;
    }

    public int peek(){
        if(head == null){
            return -1;
        }
        return head.val;
    }
}
