import java.util.Scanner;

//�ϳ���ž ����
public class P5_6 {
	
	static void move(int no,int x, int y ) {
		if(no>1)
			move(no-1,x,6-x-y);
		System.out.println("����["+no+"]��"+"��տ���"+y+"������� �ű�");
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("�ϳ���ž");
		System.out.print("���ݰ���:");
		int n=s.nextInt();
		move(n,1,3);

	}

}
