package study6;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
//두개의 배열-보석,가방  오름차순정리
//가방의 무게보다 작거나 긑은 보석은 우선큐에 담는다
//우선큐는 보석가격을 기준으로 내림차순 정리
//중복 방지를 위해 인덱스로 증가

public class short1202 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Jewelry[] jewArr = new Jewelry[N];
		int[] bagArr = new int[K];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			jewArr[i] = new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		for (int i = 0; i < K; i++) {
			bagArr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(jewArr); // jewArr 무게 오름차순 정렬
		Arrays.sort(bagArr); // bagArr 무게 오름차순 정렬

		//우선순위 큐
		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));
		
		long priceSum = 0L;
		int idx = 0;
		
		for (int i = 0; i < K; i++) {
			while (idx < N && jewArr[idx].weight <= bagArr[i]) {
				pq.add(jewArr[idx].price);
				idx++;
			}
			if (!pq.isEmpty()) priceSum += pq.poll();
		}
		System.out.println(priceSum);
	}

	static class Jewelry implements Comparable<Jewelry> {
		int weight;
		int price;

		private Jewelry(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Jewelry o) {
			return this.weight - o.weight;
		}
	}
}