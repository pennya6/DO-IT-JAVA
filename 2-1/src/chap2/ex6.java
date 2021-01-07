package chap2;
//배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드 작성
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int cardConvR(int x,int r, char []d) {
		int digits=0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSYUVWXYZ";
		do {
			d[digits++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		for(int i=0;i<digits/2;i++){
		char temp=d[i];
		d[i]=d[digits-i-1];
		d[digits-i-1]=temp;
		}
				
		return digits;
				
	}

}
