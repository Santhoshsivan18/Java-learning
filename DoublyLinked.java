public class DoublyLinked {
    public static int length = 0;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;

    public void createdl() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        n1.prev = null;
        n2.prev = n1;
        n3.prev = n2;
        n4.prev = n3;

        head = n1;

        length += 4;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public void addf(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            temp.prev = null;
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        length += 1;
    }

    public void addl(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        temp.prev = tail;
        temp.next = null;
        tail.next = temp;
        length += 1;
    }

    public void addpos(int pos, int data) {
        Node tp = new Node(data);
        Node t = head;
        if (length == pos) {
            addl(data);
        } else if (length == 0 || pos == 1) {
            addf(data);
        } else {
            for (int i = 1; i < pos - 1; i++) {
                t = t.next;
            }
            tp.prev = t;
            tp.next = t.next;

            // Node p = t.next;
            // p.prev = tp;
            t.next.prev = tp;
            t.next = tp;
        }
        length += 1;
    }

    public void delf() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        } else {
            head = head.next;
            head.prev = null;
        }
        length -= 1;
    }

    public void dell() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        } else {
            Node temp = head;
            for (int i = 1; i < length - 1; i++) {
                temp = temp.next;
            }
            temp.next.prev = null;
            temp.next = null;
        }
        length -= 1;
    }

    public void delpos(int pos) {
        if (head == null || pos == 1) {
            delf();
        } else if (pos == length) {
            dell();
        } else {
            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            temp.next.next.prev = temp;
            temp.next.prev = null;
            Node p = temp.next;
            temp.next = temp.next.next;
            // temp.next=p.next;
            p.next = null;
        }
        length -= 1;
    }

    public static void main(String[] args) {
        DoublyLinked d = new DoublyLinked();
        System.out.println("Created Doubly Linked List");
        d.createdl();
        d.display();
        System.out.println("AddFirst Doubly Linked List");
        d.addf(101);
        d.display();
        System.out.println("AddLast Doubly Linked List");
        d.addl(202);
        d.display();
        System.out.println("Add at specific position Doubly Linked List");
        d.addpos(4, 303);
        d.display();
        System.out.println("DeleteFirst Doubly Linked List");
        d.delf();
        d.display();
        System.out.println("DeleteLast Doubly Linked List");
        d.dell();
        d.display();
        System.out.println("Delete at specific position Doubly Linked List");
        d.delpos(3);
        d.display();
    }
}
