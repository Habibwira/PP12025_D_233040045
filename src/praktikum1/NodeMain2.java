package praktikum1;

public class NodeMain2 {
    public static void main(String[] args) {
       
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(9);
        Node node4 = new Node(8);

        
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        
        Node current = node1;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null"); 
    }
}
