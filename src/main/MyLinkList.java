package main;

public class MyLinkList {
    private Node head;
    private Node tail;
    private int currentsize;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getCurrentsize() {
        return currentsize;
    }

    public void setCurrentsize(int currentsize) {
        this.currentsize = currentsize;
    }

    public MyLinkList() {
        this.head=null;
        this.tail=null;
        currentsize=0;
    }


}

