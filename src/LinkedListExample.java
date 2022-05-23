import javax.print.DocFlavor;

class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList{
    Node head = null;
    void insertAtEnd(int val){
        Node newNode =new Node(val);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void deleteAtEnd(){
        if(head==null || head.next==null) {
            head = null;
            return;
        }
        Node curr = head;

        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
    }

    void printLL(){
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.val+" ");
            curr =curr.next;
        }
        System.out.println();
    }
}

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertAtEnd(10);
        li.insertAtEnd(20);
        li.printLL();
        li.insertAtEnd(30);
        li.insertAtEnd(40);
        li.printLL();
        li.deleteAtEnd();
        li.printLL();
        li.deleteAtEnd();
        li.printLL();
        li.deleteAtEnd();
        li.printLL();
        li.deleteAtEnd();
        li.printLL();
        li.deleteAtEnd();
        li.deleteAtEnd();
        li.deleteAtEnd();
        li.deleteAtEnd();
        li.deleteAtEnd();

    }
}
