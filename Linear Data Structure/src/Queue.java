public class Queue {
    class Node{
        int value;
        Node next;
        Node previous;
        Node(int value){
            this.value=value;
        }
        public String toString(){
            return ("Node Value : "+ value);
        }
    }
    Node head;
    Node tail;

    public void addNodeToTheQueue(int value){
        //this if statement handel adding to the queue when the queue is empty
        if (head==null){
            head=new Node(value);
            tail=head;
            return;
        }

        //these lines handel adding a node to the end of the queue [FIFO(first in first out)]
        Node addedNode = new Node (value);
        addedNode.next=tail;
        tail.previous=addedNode;
        tail=addedNode;
    }

    //this function remove the first added element of the queue and returns it (ex: {a->b->c} if you call this function
    //the queue will be {a->b}, if you call it again it will be{a}, and if you call it one more time it will be empty)
    public Node pushNode(){
        //this if statement handel the empty queue
        if (head==null){
            System.out.println("The queue is empty!");
            return null;
        }

        //this if statement handel the deleting form a queue that has only one Node
        if(head==tail){
            head=null;
            tail=null;
            return null;
        }

        //these lines of codes handel the deleting from a queue that has more than two elements
        Node returnedNode = head;
        head=head.previous;
        head.next=null;
        return returnedNode;
    }

    public Node peekNode(){
        return head;
    }

    public Node lastNodeInTheQueue(){
        return tail;
    }

    public void printQueue(){
        Node node = tail;
        if (node==null){
            System.out.println("The queue is empty");
            return;
        }
        System.out.println("The order is form last element added to the first added element \n(the element that is about to be pushed)");
        while (true){
            if (node.next==null){
                System.out.println(node.value);
                break;
            }
            System.out.print(node.value+"-->");
            node=node.next;
        }
    }

    public void clear(){
        head=null;
        tail=null;

    }
}
