import java.util.Stack;
public class StackImplementaion{
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // push
        st.push(5);
        st.push(9);
        st.pop();
        st.push(11);
        st.push(13);
        st.push(19);
        st.pop();
        st.pop();

        System.out.println(st);

        // top element
        System.out.println(st.peek());

        
    }
}
