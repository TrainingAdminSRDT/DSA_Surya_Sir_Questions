class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return val;
    }

    void display() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class Queue_Im {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.print("Queue: ");
        q.display();

        System.out.println("Dequeued: " + q.dequeue());

        System.out.print("Queue after dequeue: ");
        q.display();

        q.enqueue(40);

        System.out.print("Queue after enqueue 40: ");
        q.display();
    }
}