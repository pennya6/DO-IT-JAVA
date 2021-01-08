package study2;
//ABC
public class backjoon_ABC {

	public static void main(String[] args) {
		int a=150;
		int b=266;
		int c=427;
		int x=a*b*c;
		String piece[]=new String[100];
		System.out.println(x);
		String y=String.valueOf(x);
		
		for(int i=0;i<y.length();i++) {
			piece[i]=y.substring(i, i+1);
			Integer.parseInt(piece[i]);
			System.out.print(piece[i]);
		}

	}

}
