public class CircularLinked {
    public static int length = 0;

    public Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data);
            if (temp.next != head) {
                System.out.print("->");
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public void createcl() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;

        head = n1;

        length += 4;
    }

    public void addf(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            temp.next = head;
        } else {
            Node t = head;
            while (t.next != head) {
                t = t.next;
            }
            t.next = temp;
            temp.next = head;
            head = temp;
        }
        length += 1;
    }

    public void addl(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            temp.next = head;
        } else {
            Node t = head;
            while (t.next != head) {
                t = t.next;
            }
            t.next = temp;
            temp.next = head;
        }
        length += 1;
    }

    public void delf() {
        if (head == null) {
            System.out.println("Empty");
            return;
        } else if (length == 1) {
            head = null;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        length -= 1;
    }

    public void dell() {
        if (head == null) {
            System.out.println("Empty");
            return;
        } else if (length == 1) {
            head = null;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
        length -= 1;
    }

    public static void main(String[] args) {
        CircularLinked c = new CircularLinked();
        System.out.println("Circular Linked List");
        c.createcl();
        c.display();
        System.out.println("AddFirst Circular Linked List");
        c.addf(101);
        c.display();
        System.out.println("AddLast Circular Linked List");
        c.addl(505);
        c.display();
        System.out.println("DelFirst Circular Linked List");
        c.delf();
        c.display();
        System.out.println("DelLast Circular Linked List");
        c.dell();
        c.display();
    }
}