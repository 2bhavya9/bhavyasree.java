public class Stack {
    private int[] arr;
    private int top = -1;

    public Stack(int size) {
        arr = new int[size];
    }

    public void push(int val) {
        if (top < arr.length - 1) arr[++top] = val;
    }

    public int pop() {
        return (top == -1) ? -1 : arr[top--];
    }

    public int peek() {
        return (top == -1) ? -1 : arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());   // 30
        System.out.println(stack.pop());    // 30
        System.out.println(stack.pop());    // 20
        System.out.println(stack.isEmpty()); // false
        System.out.println(stack.pop());    // 10
        System.out.println(stack.isEmpty()); // true
        System.out.println(stack.pop());    // -1 (empty)
    }
}
