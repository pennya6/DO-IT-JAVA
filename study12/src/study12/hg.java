package study12;

import java.util.ArrayList;

public class hg {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList<>();
		ArrayList list2=new ArrayList<>();
		
		//��
		ArrayList a=new ArrayList<>(); 
		//��
		ArrayList b=new ArrayList<>();
		//��
		ArrayList c=new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		//code �ۼ�
		
		//��
		a.addAll(list1);
		a.retainAll(list2);
		
		
		System.out.println("������="+a);
		
		//������
		b.addAll(list1);
		b.removeAll(list2);
			
		System.out.println("������="+b);
		
		//������
		c.add(b);
		c.addAll(list2);
		System.out.println("������="+c);	
		
	}
	
	
	
	
	

}
