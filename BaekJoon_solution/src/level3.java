import java.io.*;
import java.util.*;

public class level3 {
	
	// 5. 코딩은 체육과목입니다 (신규추가문제)
	public static void baek_25314(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N/4; i++) {
			if (i == N/4) {
				bw.append("long int");
				break;
			}
			bw.append("long ");
		}
		bw.flush();
	}
	// 12. 더하기 사이클
	public static void baek_1110(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int temp = N;
		int count = 0;
		
		while(true) {
			int left  = temp/10;
			int right = temp%10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if (N == temp) {
				break;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 11. A+B - 4
	public static void baek_10951(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st;
		String str;
		
		while (true) {
			if(((str = br.readLine()) == null) || "".equals(str)) {
				break;
			}
			st = new StringTokenizer(str, " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(A+B));
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 10. A+B - 5
	public static void baek_10952(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		if(A == 0 && B == 0) {
    			break;
    		}
			bw.write(String.valueOf(A+B));
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 9. 별찍기 - 2
	public static void baek_2439(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 1; i <= cnt; i++) {
			for (int j = cnt-i; j >= 1; j--) {
				bw.write(String.valueOf(" "));
			}
			for (int j = 1; j <= i; j++) {
				bw.write(String.valueOf("*"));
			}
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 8. 별찍기 - 1
	public static void baek_2438(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write(String.valueOf("*"));
			}
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 7. A+B - 8
	public static void baek_11022(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		int res = A+B;
    		if(i < T) {
    			bw.write(String.valueOf("Case #"+i+": "+A+" + "+B+" = "+res));
    			bw.newLine(); // 줄바꿈
    		}else {
    			bw.write(String.valueOf("Case #"+i+": "+A+" + "+B+" = "+res));
    		}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 6. A+B - 7
	public static void baek_11021(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		int res = A+B;
    		if(i < T) {
    			bw.write(String.valueOf("Case #"+i+": "+res));
    			bw.newLine(); // 줄바꿈
    		}else {
    			bw.write(String.valueOf("Case #"+i+": "+res));
    		}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 5. 빠른 A+B
	public static void baek_15552(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringBuilder sb = new StringBuilder();
//		bw.write(); // 출력
//		bw.newLine(); // 줄바꿈
//		bw.flush(); // 남아있는 데이터 모두 출력
//		bw.close();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		if(i < T-1) {
    			bw.write(String.valueOf(A+B));
    			bw.newLine(); // 줄바꿈
    		}else {
    			bw.write(String.valueOf(A+B));
    		}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 4. 영수증
	public static void baek_25304(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int price = Integer.parseInt(br.readLine()); // 영수증 가격
		int n = Integer.parseInt(br.readLine()); // 물건개수
		int a = 0;
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int cost = Integer.parseInt(st.nextToken());
    		int cnt = Integer.parseInt(st.nextToken());
    		a += cost * cnt;
		}
		if (a==price) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
	// 3. 합
	public static void baek_8393(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		System.out.print(a);
	}
	// 2. A+B - 3
		public static void baek_10950(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
			StringBuilder sb = new StringBuilder();
			int T = Integer.parseInt(br.readLine());
			for (int i = 0; i < T; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    		int A = Integer.parseInt(st.nextToken());
	    		int B = Integer.parseInt(st.nextToken());
	    		if(i < T) {
	    			sb.append(A+B+"\n");
	    		}else {
	    			sb.append(A+B);
	    		}
			}
			System.out.print(sb);
		}
	// 1. 구구단
	public static void baek_1330(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		for (int i = 1; i < 10; i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
}
