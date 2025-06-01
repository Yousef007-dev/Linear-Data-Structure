public class Stack {
    public class Node{
        int value;
        Node next;
        Node (int value){
            this . value = value;
        }
    }
    Node surface;
    public void push(int value){

        if (surface == null){
            surface = new Node(value);
            return;
        }

        Node newNode = new Node (value);
        newNode.next = surface;
        surface=newNode;
    }

    public void pop(){
        if (surface == null){
            System.out.println("the stack is empty");
        }
        surface = surface.next;
    }

    public Node peek(){
        if (surface==null){
            return null;
        }

        return surface;
    }


}
