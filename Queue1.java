import java.util.Queue;
import java.util.LinkedList;

public class Queue1{
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // insert
        q.offer(10 );
        q.offer(20);
        q.offer(30);

        System.out.println(q);

        // front element
        System.out.println(q.peek());

        // remove
        q.poll();

        System.out.println(q);
    }
}