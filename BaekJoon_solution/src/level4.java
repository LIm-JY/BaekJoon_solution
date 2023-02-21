import java.io.*;
import java.util.*;

public class level4 {
	
	// 9. 평균은 넘겠지
	public static void baek_4344(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for (int i = 0; i < len; i++) {
			double avg = 0.0d; // 평균 값
			st = new StringTokenizer(br.readLine(), " ");
			int scoreLen = Integer.parseInt(st.nextToken()); // 학생 수
			int[] score = new int[scoreLen];
			
			for (int j = 0; j < scoreLen; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				avg += score[j];
			}
			double cnt = 0;
			avg = avg/scoreLen; // 평균 값 완료
			// 평균 값 비교 후 큰 카운트 세기
			for (int j = 0; j < scoreLen; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}
			bw.write(String.format("%.3f%%", ((cnt/scoreLen)*100)));
			bw.newLine();
		}
		
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 8. OX퀴즈
	public static void baek_8958(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine()); // 길이
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			String[] a = br.readLine().split("");
			int tmpCnt = 0; // 임시 카운트
			for (int j = 0; j < a.length; j++) {
				if("O".equals(a[j])) {
					tmpCnt++;
					cnt += tmpCnt;
				}else {
					tmpCnt = 0;
				}
			}
			bw.write(String.valueOf(cnt));
			bw.newLine();
			cnt = 0;
		}
		bw.flush(); // 남아있는 데이터 모두 출력
		bw.close(); // 닫기
	}
	// 7. 평균 
	public static void baek_1546(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double[] arr = new double[len];
		for (int i = 0; i < len; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		Arrays.sort(arr);
		double n = 0.0d;
		for (int i = 0; i < arr.length; i++) {
			n += (arr[i]/arr[arr.length-1])*100;
		}
		n = n/len;
		
		bw.write(String.valueOf(n));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 6. 나머지
	public static void baek_3052(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		/** case 1
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			set.add(a%42);
		}
		bw.write(String.valueOf(set.size()));
		bw.flush(); // 남아있는 데이터 모두 출력
		*/
		/** case 2*/
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a%42;
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmpCnt = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					tmpCnt++;
				}
			}
			if (tmpCnt == 0) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 5. 과제 안 내신 분..?
	public static void baek_5597(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[31];
		for (int i = 0; i < 28; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a] = 1;
		}
		for (int i = 1; i <= arr.length-1; i++) {
			if(arr[i]!= 1) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 4. 최대값
	public static void baek_2562(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE; // 최대값
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				cnt = i+1;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n").append(cnt);
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 3. 최소, 최대
	public static void baek_10818(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine()); // 첫째 줄
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE; // 최대값
		int min = Integer.MAX_VALUE; // 최소값
		for (int i = 0; i < len; i++) {
			int a = Integer.parseInt(st.nextToken()); // 둘째 줄
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 2. X보다 작은 수
	public static void baek_10871(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		LinkedList<Integer> list = new LinkedList<Integer>(); // 둘째 줄을 담아줄 리스트
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 첫째 줄 - 1
		int X = Integer.parseInt(st.nextToken()); // 첫째 줄 - 2
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken())); // 둘째 줄
		}
		
		StringBuilder sb = new StringBuilder();
		// X와 같은 수를 리스트에서 찾아준다.
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < X) {
				sb.append(list.get(i)).append(" ");;
			}
		}
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 1. 개수세기
	public static void baek_10807(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		LinkedList<Integer> list = new LinkedList<Integer>(); // 둘째 줄을 담아줄 리스트
		int len = Integer.parseInt(br.readLine()); // 첫째 줄
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < len; i++) {
			list.add(Integer.parseInt(st.nextToken())); // 둘째 줄
		}
		int cnt = 0; // 몇번 찾는지 세줄 카운트
		int v = Integer.parseInt(br.readLine()); // 셋째 줄
		// v과 같은 수를 리스트에서 찾아준다.
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == v) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}
