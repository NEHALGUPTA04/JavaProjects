class Stack {
    static final int MAX = 6;
    int top;
    int Stack[] = new int[MAX]; // Maximum size of Stack

    void isEmpty() {
        if (top < MAX)
            System.out.println("Yes ,Stack is empty !!!");
        else
            System.out.println("Stack is full !!!");
    }

    Stack() {

        top = -1;
    }

    void push(int element) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
        } else {
            Stack[++top] = element;
            System.out.println(element + " pushed into stack");
        }
    }

    void displayStack() {
        System.out.println("Resultant stack is:");
        for (int i = top; i >= 0; --i) {
            System.out.println(Stack[i]);
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }

        else {
            int element = Stack[top--];
            return element;
        }
    }
}

class Queue {
    static final int MAX = 6;
    int rear, front = 0;
    int queue[] = new int[MAX]; // Maximum size of Stack

    void isEmpty() {
        if (rear < MAX) {
            System.out.println("Yes ,Queue is empty !!!");
        } else {
            System.out.println("Queue is full !!!");
        }
    }

    Queue() {

        rear = -1;

    }

    void enqueue(int element) {
        if (rear >= (MAX - 1)) {
            System.out.println("Queue is full!!!");
        } else {
            queue[++rear] = element;
            System.out.println(element + " inserted to queue");
        }
    }

    void displayQueue() {
        System.out.println("Resultant queue is : " );
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    int dequeue() {
        if (rear < 0) {
            System.out.println("queue is empty !!!");
            return 0;
        } else {
            int element = queue[rear--];
            return element;
        }
    }
}

class StackQueue {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(11);
        s.push(2);
        s.push(31);
        s.displayStack();
        System.out.println(s.pop() + " Popped from stack");
        s.displayStack();

        Queue q = new Queue();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(32);
        q.displayQueue();
        System.out.println(q.dequeue() + " deleted from queue");
        q.displayQueue();
    }
}