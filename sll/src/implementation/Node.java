package implementation;

public class Node {
    private int data;
    private Node next;

    public Node(){data=0;
    next=null;}

    public Node(int d,Node n){
        data=d;
        next=n;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

