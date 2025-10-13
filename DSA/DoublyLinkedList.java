public class DoublyLinkedList {
    Dnode head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void InsertAtBeginning(int data) {
        Dnode newNode = new Dnode(data);

        // List is empty
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        // There are one or more nodes
        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
    }

    public void InsertAtEnd(int data) {
        Dnode newNode = new Dnode(data);

        // List is empty
        if (this.head == null) {
            this.head = newNode;
            return;
        }

        // List has one or more nodes
        Dnode lastNode = this.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        // append the new node to the last node
        lastNode.next = newNode;
        newNode.prev = lastNode;
    }

    public void insertAtPosition(int data, int taregetPosition) {
        if (taregetPosition <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (this.head == null && taregetPosition == 1) {
            this.InsertAtBeginning(data);
            return;
        }

        Dnode leftNode = this.head;
        int currentPosition = 1;
        while (currentPosition < taregetPosition - 1) {
            if (leftNode == null) {
                System.out.println("Invalid target position, it's more than the number of nodes");
                return;
            }

            leftNode = leftNode.next;
            currentPosition = currentPosition + 1;
        }

        // lefNode is now one step away from the node with position in which we want to
        // insert a node
        Dnode newNode = new Dnode(data);
        if (leftNode.next == null) {
            // Case when new node is added at the end
            leftNode.next = newNode;
            newNode.prev = leftNode;
        } else {
            // Case when new node is added in between
            newNode.next = leftNode.next; // 1
            newNode.prev = leftNode; // 2
            leftNode.next.prev = newNode; // 3
            leftNode.next = newNode; // 4
        }
    }

    public void printAllNodes() {
        // List is empty
        if (this.head == null) {
            System.out.println("List is empty!");
            return;
        }

        Dnode currentNode = this.head;
        System.out.println("Nodes in the list are !");
        while (currentNode != null) {
            System.err.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.next;
        }
        System.out.println("\n");

    }

    public void printAllNodesReverseOrder() {
        // List is empty
        if (this.head == null) {
            System.out.println("List is empty!");
            return;
        }

        Dnode currentNode = this.head;
        System.out.println("Nodes in the list are !");
        while (currentNode.next != null) {
            System.out.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.next;
        }

        System.out.println("reverse order ");
        while (currentNode != this.head) {
            System.out.print("  " + currentNode.data + "  <--> ");
            currentNode = currentNode.prev;
        }

        System.out.println("\n");

    }

    public void search(int key)
    {
       // List is empty
       if (this.head == null)
       {
           System.out.println("List is empty!");
           return;
       }

       Dnode currentNode = this.head;
       System.out.println("Nodes in the list are !");
       while (currentNode != null)
       {
           if (key == currentNode.data)
           {
                // key is found
                System.out.println("Key is found");
                return;
           }

           currentNode = currentNode.next;
       }

       System.out.println("Key is NOT found!");
    }
