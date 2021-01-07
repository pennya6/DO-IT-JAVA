package chap2;
//기수변환
public class P2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int CardConvR(int x,int r,char []d) {
		int di=0; //변환후의 자릿수
		//문자열 dchar
		//초기화된 값 
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[di++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return di;
	}

}
