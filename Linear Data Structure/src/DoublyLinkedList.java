public class DoublyLinkedList {
    public class Node{
        int value;
        Node next;
        Node previous;
        Node(int value){
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public void insertAtEnd(int value){
        if (head == null){
            head = new Node(value);
            tail=head;
            head.next=tail;
            tail.previous = head;
            return;
        }

        Node newNode = new Node(value);
        newNode.previous=tail;
        tail.next=newNode;
        tail = newNode;
    }

    public void insertAtBeginning(int value){
        if (head == null){
            tail = new Node(value);
            head = new Node(value);
            return;
        }

        Node newNode = new Node (value);
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void printFromBeginning(){
        if (head == null ){
            System.out.println("the list is empty ");
            return;
        }
        // if you want to print from the end just put tail instead of head && put previous instead of next
        Node currant = head;

        while (currant != null){

            System.out.println(currant.value);
            currant=currant.next;

        }
    }

    public void deleteValue(int value) {

        Node currant = head;
        while (currant != null){
            if (currant.value == value){

                if (currant.previous != null){
                    currant.previous.next=currant.next;
                }
                else {
                    head=currant.next;

                }

                if (currant.next!=null){
                    currant.next.previous=currant.previous;
                }
                else {
                    tail=currant.previous;
                }
                break;
            }
            currant=currant.next;
        }

    }

}
