public class LinkedList {
    public class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    Node head;

    void add(int value){

        if (head== null){
            head =new Node(value);

        }

       else {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
    }

    boolean findValue(int value){

        if (head== null){
            System.out.println("the linked list is empty");
            return false;
        }

        else {
            Node currant = head;
            while (currant != null){
                if (currant.value == value){
                    System.out.println("the value is found");
                    return true;
                }
                currant=currant.next;
            }

            return false;
        }


    }

    void remove(int value){
        if (head == null){
            System.out.println("the linked list is empty");
            return;
        }

        Node currant = head.next;
        Node previous= head;

        while (currant != null){
            if (currant.value == value){
                previous.next = currant .next;

                System.out.println("the value is removed");
                return;
            }
            previous = currant;
            currant = currant.next;
        }

        System.out.println("the value is not found");

    }

    void deleteAllOccurrences(int data){
        if (head == null){
            return;
        }
        // while instead of if
        while (head != null && head.value == data){
            head = head.next;
            // remove return
        }
        Node current = head.next, prev = head;
        while(current != null){
            if(current.value == data){
                prev.next = current.next;

                // delete the node and use continue instead of return
                current = prev.next;
                continue;
            }
            prev = current;
            current = current.next;
        }
        return;
    }

    void reversTheLinkedList(){



        Node current = head, prev = null, nnext = null;
        while (current != null){

            while(current != null){
                nnext = current.next;
                current.next = prev;
                prev = current;
                current = nnext;
            }
            head = prev;
        }
    }

    void print(){
        if (head == null){
            System.out.println("the linked list is empty");
        }
        Node currant= head;
        while (currant != null){
            System.out.println(currant.value);
            currant = currant.next;
        }

    }

}