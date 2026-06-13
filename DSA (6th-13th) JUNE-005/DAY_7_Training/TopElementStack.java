public class TopElementStack {
    public static void main(String[] args) {
        int[] stack = new int[10];
        int top = -1;

        // push(5)
        stack[++top] = 5;

        // push(9)
        stack[++top] = 9;

        // pop()
        top--;

        // push(12)
        stack[++top] = 12;

        // push(19)
        stack[++top] = 19;

        // pop()
        top--;

        // push(16)
        stack[++top] = 16;

        // pop()
        top--;

        System.out.println("Top element = " + stack[top]);
    }
}

