public class QueueMain {
    public static void main(String []args) {
        Queue queue = new Queue();
        queue.push(5);
        queue.push(6);
        queue.push(2);
        queue.push(7);
        System.out.println("pop:" + queue.pop());
        System.out.println("pop:" + queue.pop());
        System.out.println("pop:" + queue.pop());
        System.out.println("peek :" + queue.peek());

    }
}

