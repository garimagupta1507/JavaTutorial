public class StackMain {
    public static void main(String []args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(2);
        stack.push(7);
        System.out.println("pop:" + stack.pop());
        System.out.println("pop:" + stack.pop());
        System.out.println("pop:" + stack.pop());
        System.out.println("peek :" + stack.peek());

    }
}
