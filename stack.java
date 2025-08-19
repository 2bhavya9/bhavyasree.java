public class Stack {
        private int[] arr;
        private int top;

        public Stack(int capacity) {
            arr = new int[capacity];
            top = -1;
        }

        public void push(int val) {
            if (top == arr.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = val;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            return isEmpty() ? -1 : arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public static void main(String[] args) {
            Stack stack = new Stack(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println(stack.pop());   
            System.out.println(stack.peek());  
            stack.push(40);
            stack.push(50);
            stack.push(60);
            stack.push(70);  

            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            System.out.println(stack.pop());  
        }
    }

