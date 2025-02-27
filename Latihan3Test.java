package node;

public class Latihan3Test {
	public static void main(String[] args) {
		StrukturList latihan3 = new StrukturList();
		latihan3.addLast(3);
		latihan3.addLast(4);
		latihan3.addMid(7, 2);
		latihan3.addMid(8, 2);
		latihan3.addFirst(5);
		System.out.print("Latihan 3 output: ");
		latihan3.display(); 
	}

}
