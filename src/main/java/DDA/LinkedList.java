package DDA;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {
    Node insertNode(Node start, int data, int pos) {
        Node n1 = new Node(data);
        if (pos == 0 || start == null) {
            n1.next = start;
            return n1;
        } else if (pos < 0) {
            Node copy = start;
            while (copy.next != null) {
                copy = copy.next;
            }
            copy.next = n1;
            return start;
        } else {
            int step = 1;
            Node copy = start;
            while (copy.next != null) {
                if (step == pos) {
                    n1.next = copy.next;
                    copy.next = n1;
                    return start;
                }
                step++;
                copy = copy.next;
            }
            System.out.println("Reached end of list");
            return start;
        }
    }

    void printNode(Node start) {
        while (start != null) {
            System.out.println(start.data);
            start = start.next;
        }
    }

    void countNode(Node start) {
        int count = 0;
        while (start != null) {
            count++;
            start = start.next;
        }
        System.out.println("Count = " + count);
    }

    void countIfNode(Node start) {
        int count = 0;
        while (start != null) {
            if (start.data >= 18)
                count++;
            start = start.next;
        }
        System.out.println("Count = " + count);
    }

    void sumNode(Node start) {
        int sum = 0;
        while (start != null) {
            sum = sum + start.data;
            start = start.next;
        }
        System.out.println("Sum = " + sum);
    }

    void sumIfNode(Node start) {
        int sum = 0;
        while (start != null) {
            if (start.data % 2 == 0)
                sum = sum + start.data;
            start = start.next;
        }
        System.out.println("Sum = " + sum);
    }

    void productNode(Node start) {
        int prod = 1;
        while (start != null) {
            prod = prod * start.data;
            start = start.next;
        }
        System.out.println("Product = " + prod);
    }

    void productIfNode(Node start) {
        int prod = 1;
        while (start != null) {
            if (start.data % 2 == 1)
                prod = prod * start.data;
            start = start.next;
        }
        System.out.println("Product of odd = " + prod);
    }

    void minNode(Node start) {
        int min = start.data;
        while (start != null) {
            if (start.data < min)
                min = start.data;
            start = start.next;
        }
        System.out.println("Min Value = " + min);
    }

    void maxNode(Node start) {
        int max = start.data;
        while (start != null) {
            if (start.data > max)
                max = start.data;
            start = start.next;
        }
        System.out.println("Min Value = " + max);
    }

    void searchNode(Node start, int val) {
        while (start != null) {
            if (start.data == val) {
                System.out.println("found");
                return;
            }
            start = start.next;
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opt = 0;
        Node start = null;
        LinkedList llist = new LinkedList();
        do {
            System.out.println("Enter the option: 1 insert 2 print 3 countNode 4 countIfNode 5 sumNode 6 sumIfNode 7 productNode 8 productIfNode 9 minNode 10 maxNode 11 searchNode 12 exit ");
            opt = input.nextInt();
            switch (opt) {
                case 1 -> {
                    System.out.println("Enter data");
                    int data = input.nextInt();
                    System.out.println("Enter position");
                    int pos = input.nextInt();
                    start = llist.insertNode(start, data, pos);
                }
                case 2 -> llist.printNode(start);
                case 3 -> llist.countNode(start);
                case 4 -> llist.countIfNode(start);
                case 5 -> llist.sumNode(start);
                case 6 -> llist.sumIfNode(start);
                case 7 -> llist.productNode(start);
                case 8 -> llist.productIfNode(start);
                case 9 -> llist.minNode(start);
                case 10 -> llist.maxNode(start);
                case 11 -> {
                    System.out.print("Enter search Node");
                    int p = input.nextInt();
                    llist.searchNode(start, p);
                }
            }
        } while (opt != 12);
    }
}