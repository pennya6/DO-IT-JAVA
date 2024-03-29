package chapter2;

import java.util.Scanner;


//신체검사 데이터 
//클래스의 배열로 구현class PhysicalExamination{
//시력분포 21개

public class P2_14 {
	static final int VMAX=21;

	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name,int height, double vision){
			this.name=name;
			this.height=height;
			this.vision=vision;
		}
	}
	//키의 평균값
	static double aveHeight(PhyscData[] dat) {
		double sum=0;
		
		for(int i=0;i<dat.length;i++) {
			sum+=dat[i].height;
			
		}
		return sum/dat.length;
	}
	//시력분포를 구함
	static void distVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0;
		for(i=0;i<dat.length;i++) {
			if(dat[i].vision>=0.0&&dat[i].vision<=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		PhyscData[] x= {
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영규", 174, 1.2),
				new PhyscData("박용규", 169, 0.8)
		};
		int [] vdist=new int[VMAX];
		System.out.println("신체검사 리스트");
		
		for(int i=0;i<x.length;i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);
		}
		System.out.printf("\n평균키:%5.1fcm\n",aveHeight(x));
		distVision(x, vdist);
		
		System.out.println("\n시력분포");
		
		for(int i=0;i<VMAX;i++) {
			System.out.printf("%3.1f~:%2s명\n",i/10.0,vdist[i]);
		}

	}
} 
//JAVA prinf 
//서식이 있는 출력
//%f: 실수
//%c: 문자
//%s:문자열
//%d:정수