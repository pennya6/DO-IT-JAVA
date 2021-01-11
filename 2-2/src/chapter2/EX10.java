package chapter2;

import chapter2.P2_14.PhyscData;

//�÷º����� ������ó�� �׷����� ����ϵ��� �ٲپ� �ۼ�
//��ȣ ���� *�� �������ŭ �ݺ�
public class EX10 {
	static final int VMAX=25;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		//������
		PhyscData(String name,int height,double vision){
			//�ʱ�ȭ
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
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0),
				new PhyscData("ȫ����", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("�迵��", 174, 1.2),
				new PhyscData("�ڿ��", 169, 0.8)
		};
		
		int[] dist=new int [VMAX];
		
		distvision(x, dist);
		System.out.println("�÷º���");
		
		
		for(int i=0;i<VMAX;i++) {
			System.out.printf("%3.1f~:",i/10.0);
			for(int j=0;j<dist[i];j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
