package node;

public class TugasTest {
    public static void main(String[] args) {
        StrukturList list1 = new StrukturList();
        list1.addFirst(3.4);
        list1.addLast(4.5);
        list1.addFirst(2.1);
        System.out.print("Tugas Output 1: ");
        list1.display(); 

        StrukturList list2 = new StrukturList();
        list2.addFirst(3.4);
        list2.addLast(4.5);
        list2.addLast(5.5);
        list2.addMid(2.1, 1);
        list2.addMid(1.1, 2);
        System.out.print("Tugas Output 2: ");
        list2.display(); 
    }
}