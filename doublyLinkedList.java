import java.util.Scanner;

class Dll {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }

    Node head, tail = null;

    public void addNode() {
        Scanner sc = new Scanner(System.in);
        int item;
        System.out.println("\nEnter the data to be stored in the node: ");
        item = sc.nextInt();

        Node newNode = new Node(item);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        this.display();
    }

    public void display() {
        Node ptr = head;
        if (head == null) {
            System.out.println("The doubly linked list is empty!");
            return;
        }
        System.out.println("\nThe current state of the doubly linked list: ");
        while (ptr != null) {
            System.out.print(ptr.data + "  ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public void deleteNode() {
        if (head == null) {
            System.out.println("\nThe doubly linked list is empty!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        int item;
        System.out.println("\nEnter the data to be in the node which is to be deleted: ");
        item = sc.nextInt();

        Node ptr = head;

        while (ptr != null) {
            if (ptr.data == item)
                break;
            ptr = ptr.next;
        }

        if (ptr == null) {
            System.out.println("\nNode not found! Please enter a valid node!");
        }

        if (head == tail) {
            head = tail = null;
        } else {
            if (ptr.previous == null) {
                head = head.next;
                head.previous = null;
            } else if (ptr.next == null) {
                tail = tail.previous;
                tail.next = null;
            } else {
                ptr.next.previous = ptr.previous;
                ptr.previous.next = ptr.next;
            }
        }
        this.display();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        Dll dll = new Dll();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1.Add node");
            System.out.println("2.Delete node");
            System.out.println("3.Display the doubly linked list");
            System.out.println("4.Exit");

            System.out.print("\nEnter a choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    dll.addNode();
                    break;

                case 2:
                    dll.deleteNode();
                    break;

                case 3:
                    dll.display();
                    break;

                case 4:
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a valid choice.");
                    break;
            }
        }
    }
}