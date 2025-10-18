public class Node {

    int data; // variables
    Node next; // next node adress

    public Node(int data) { // no need write void returntype in construction block
        this.data = data;
        this.next = null;

        System.out.println(("A new node has been created with data = " + this.data));
    }
}