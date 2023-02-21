import java.io.*;
import java.util.*;

public class level5 {
	
}
//3. 한수
class baek_1065{
	// 3. 한수
	public static void baek_1065(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		String res = String.valueOf(arithmeticSeq_beak_1065(Integer.parseInt(br.readLine()))); // 결과 값 = 한수를 구하는 함수에 입력받은 한 수를 넣은 값 
		bw.write(res);
		bw.flush();
		bw.close();
	}
	// 3. 한수
	public static int arithmeticSeq_beak_1065(int n) {
		int cnt = 0; // 한수 카운트
		// n이 100보다 작을 때
		if(n < 100){
			return n;
		}
		// 100보다 클 때
		else {
			cnt = 99; // 카운트는 99부터
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;		 // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;   	 // 일의 자리수
	            
				// 각 자릿수가 수열을 이룰 때
				if((hun - ten) == (ten - one)){
					cnt++; // 카운트 ++
				}
			}
		}
		return cnt;
	}
}
//2. 셀프넘버
class baek_4673{
	// 2. 셀프넘버
	public baek_4673(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[10001]; // 10000개 이상인 것들을 담아줄 배열
		// 함수를 for문을 이용하여 돌린다.
		for (int i = 1; i < 10001; i++) {
			int result = selfNumber_beak_4673(i); // 함수 진입
			if(result < 10001) {
				arr[result]++;
			}
		}
		for (int i = 1; i < 10001; i++) {
			// 0인 인덱스 출력
			if (arr[i]==0) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 2. 셀프 넘버 
	public static int selfNumber_beak_4673(int n) {
		int sum = n; // sum으로  return
		// n이 0이 아니면
		while(n != 0){
			sum += (n % 10); // 첫 째 자리수
			n = n/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
		return sum;
	}
}
//1. 정수 N개의 합
class baek_15596{
	// 1. 정수 N개의 합
	public baek_15596(String[] args) throws IOException {
		
	}
	long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+= a[i];
		}
		return sum;
	}
}
