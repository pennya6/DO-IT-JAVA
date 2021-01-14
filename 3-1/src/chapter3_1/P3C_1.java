package chapter3_1;
class id{
	private static int counter=0;
	private int id;
	public id() {
		id=++counter;
	}
	public int getID() {return id;}
	public static int getCounter() {
		return counter;
	}
}
public class P3C_1 {
	
	public static void main(String[] args) {
		id a=new id();
		id b=new id();
		
		System.out.println(a.getID());
		System.out.println(b.getID());
		System.out.println(id.getCounter());

	}

}
