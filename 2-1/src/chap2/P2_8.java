package chap2;
//�����ȯ
public class P2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int CardConvR(int x,int r,char []d) {
		int di=0; //��ȯ���� �ڸ���
		//���ڿ� dchar
		//�ʱ�ȭ�� �� 
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[di++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return di;
	}

}
