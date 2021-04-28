package study11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.dynalink.support.ChainedCallSite;
import study11.OpenHash.Bucket;

public class OpenHashTester {
		static Scanner s=new Scanner(System.in);
		static class Data{
			private String code; //항공사 코드
			private String name; //항공사 이름
			
			String KeyCode() {
				return code;
			}
			public String toString() {
				return name;
			}
			void scanData(String name) {
				System.out.println("검색할 항공사 이름을 입력하시오 :");
				name=s.next();
				System.out.println("항공사 코드를 입력하시오:");
				code=s.next();
			}
		}

		public static void main(String[] args) throws IOException {
			OpenHash<Data, Data> hash=new OpenHash<OpenHashTester.Data, OpenHashTester.Data>(4);
			String str;
			BufferedReader in=new BufferedReader(new FileReader("C:/algorithm/CARRIERS.txt"));
			int n=0;
			ArrayList<String> list = new ArrayList();
			while((str=in.readLine())!=null) {
				n++;
				list.add(str);
				System.out.println(str);
			}
			for(int i=0;i<n;i++) {
				String tok=list.get(i);
				String []token=tok.split("	");
			}
			
			
			
		}
}
