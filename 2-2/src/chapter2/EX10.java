package chapter2;

import chapter2.P2_14.PhyscData;

//시력분포를 오른쪽처럼 그래프로 출력하도록 바꾸어 작성
//기호 문자 *를 사람수만큼 반복
public class EX10 {
	static final int VMAX=25;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		//생성자
		PhyscData(String name,int height,double vision){
			//초기화
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
	}

	static void distvision(PhyscData[] dat,int [] dist) {
		int i=0;
		dist[i]=0;
		for(i=0;i<dat.length;i++) {
			if(dat[i].vision>=0.0&&dat[i].vision<=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
		}
	}
	public static void main(String[] args) {
		PhyscData[] x= {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영규", 174, 1.2),
				new PhyscData("박용규", 169, 0.8)
		};
		
		int[] dist=new int [VMAX];
		
		distvision(x, dist);
		System.out.println("시력분포");
		
		
		for(int i=0;i<VMAX;i++) {
			System.out.printf("%3.1f~:",i/10.0);
			for(int j=0;j<dist[i];j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
