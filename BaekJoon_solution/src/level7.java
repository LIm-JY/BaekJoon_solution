import java.io.*;
import java.math.*;
import java.util.*;

public class level7 {
	
	// 8. 큰수 A+B
	public static void baek_10757(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		BigInteger sum = A.add(B);
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
	}
	// 7. 설탕 배달
	public static void baek_2839(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
		int result = 0; // 결과값
		// 1. 4나 7이면 3이나 5로 나눠도 될 수 없다.
		if (N == 4 || N == 7) {
			result = -1;
		}
		// 2. 5로 나누었을 때 0이면 N/5
		else if (N % 5 == 0) {
			result = N/5;
		}
		// 3. 5로 나누었을 때 나머지가 1이거나 나머지가 3일 때 (나머지가 1이 나온다면 3의배수가 될 수 있음)
		else if (N % 5 == 1 || N % 5 == 3) {
			result = (N / 5) + 1;
		}
		// 4. 5로 나누었을 때 나머지가 2이거나 나머지가 4일 때 +2
		else if (N % 5 == 2 || N % 5 == 4) {
			result=(N / 5) + 2;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
	// 6. 부녀회장이 될테야
	public static void baek_2775(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// 1. k층의 n호에 살려면 자신의 아래(k-1)층의 1호부터 n호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
		// 2. 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
		
		int[][] apt = new int[15][15]; // 아파트 생서어
		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1; // i층 1호
			apt[0][i] = i; // 0층 i호
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}
		
		int T = Integer.parseInt(br.readLine());	// 테스트데이터 수
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호
			bw.write(String.valueOf(apt[k][n]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	// 5. ACM 호텔
	public static void baek_10250(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int T = Integer.parseInt(br.readLine());	// 테스트데이터 수
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());	// 호텔의 층수
			int W = Integer.parseInt(st.nextToken());	// 각 층의 방 수
			int N = Integer.parseInt(st.nextToken());	// 몇번 째 손님인지
			int floor = N%H == 0 ? H*100 : (N%H)*100; // 0이면 H로 아니면 N%H 최소 100의 자릿수 부터 시작하므로 *100
			int ho = N%H == 0 ? N/H : (N/H)+1; // N%H가 0이면 N/H 아니면 N/H+1
			int res = floor + ho;
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	// 4. 달팽이는 올라가고 싶다.
	public static void baek_2869(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());	// A 오르는거
		int B = Integer.parseInt(st.nextToken());	// B 내리는거
		int V = Integer.parseInt(st.nextToken()); 	// V 길이
		int reach = (V-B)/(A-B); // 도착시간
		// 나머지가 0보다 크면?
		if((V-B)%(A-B) > 0) {
			reach++; //도착시간++
		}
		bw.write(String.valueOf(reach));
		
		bw.flush();
		bw.close();
	}
	// 3. 분수찾기
	public static void baek_1193(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine()); // 고정 비용
		
		int cnt = 1;
		int sum = 0;
		// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
		while (true) {
    		if (N <= sum + cnt) {
    			// 대각선의 개수가 홀수일 때
    			if (cnt % 2 == 1) { 
    				// 분자가 큰 수부터 시작
    				// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
    				// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
    				bw.write((cnt - (N - sum - 1)) + "/" + (N - sum));
    				break;
    			}
    			// 대각선의 개수가 짝수일 때
    			else {
    				// 홀수일 때의 출력을 반대로 
    				bw.write((N - sum) + "/" + (cnt - (N - sum - 1)));
    				break;
    			}
    
    		} else {
    			sum += cnt;
    			cnt++;
    		}
		}
		
		bw.flush();
		bw.close();
	}
	// 2. 벌집
	public static void baek_2292(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 고정 비용
		int cnt = 1;
		int min = 2; // 1은 1개여서 2부터 시작
		// 1이면 1
		if(N==1) {
			bw.write("1");
		}else {
			while(min <=N) {
				min = min + (6*cnt);
				cnt++;
			}
			bw.write(String.valueOf(cnt));
		}
		bw.flush();
		bw.close();
	}
	// 1. 손익분기점
	public static void baek_1712(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 고정 비용
		int B = Integer.parseInt(st.nextToken()); // 가변 비용
		int C = Integer.parseInt(st.nextToken()); // 판매가
		if(C <= B) {
			bw.write("-1");
		}else {
			bw.write(String.valueOf((A/(C-B))+1));
		}
		bw.flush();
	}
}
