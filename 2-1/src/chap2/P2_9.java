package chap2;
//1000������ �Ҽ� ����
public class P2_9 {

	public static void main(String[] args) {

		int counter =0; //������ Ƚ��
		for(int n=2;n<=1000;n++) {
			int i;
			for(i=2;i<n;i++) {
				counter++;
				//������ �������� �Ҽ��� �ƴϴ�
				if(n%i==0)
					break;
			}
			//�Ҽ�
			if(n==i)
				System.out.println(n);
			
		}
		System.out.println(counter);
	}

}
