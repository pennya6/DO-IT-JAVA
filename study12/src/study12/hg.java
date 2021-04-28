package study12;

import java.util.ArrayList;

public class hg {

	public static void main(String[] args) {
		ArrayList list1=new ArrayList<>();
		ArrayList list2=new ArrayList<>();
		
		//교
		ArrayList a=new ArrayList<>(); 
		//차
		ArrayList b=new ArrayList<>();
		//합
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
		
		//code 작성
		
		//교
		a.addAll(list1);
		a.retainAll(list2);
		
		
		System.out.println("교집합="+a);
		
		//차집합
		b.addAll(list1);
		b.removeAll(list2);
			
		System.out.println("차집합="+b);
		
		//합집합
		c.add(b);
		c.addAll(list2);
		System.out.println("합집합="+c);	
		
	}
	
	
	
	
	

}
