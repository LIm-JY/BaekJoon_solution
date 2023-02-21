import java.io.*;
import java.util.*;

public class level8 {
	// 6. 골드바흐의 추측
	public static boolean[] prime_9020 = new boolean[10001]; 
	public static void baek_9020(String[] args) throws IOException {
		// 1. 소수: false
		// 2. 소수X: true
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
			// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			get_prime_9020();	// 소수를 얻는 메소드 실행
			int T = Integer.parseInt(br.readLine());
			for (int i = T; i > 0; i--) {
				int n = Integer.parseInt(br.readLine());
				int a = n/2;
				int b = n/2;
				while (true) {
					if (prime_9020[a]==false && prime_9020[b]==false) {
						bw.write(Integer.toString(a)+" "+Integer.toString(b));
						bw.newLine();
						break;
					}
					a--;
					b++;
				}
			}
			bw.flush();
			bw.close();
	}
	// 6번 에라토스테네스의 체 알고리즘
    public static void get_prime_9020() {
    	// true = 소수아님 , false = 소수 
    	prime_9020[0] = prime_9020[1] = true;
    	
    	for(int i = 2; i <= Math.sqrt(prime_9020.length); i++) {
    		if(prime_9020[i]) {
    			continue;
    		}
    		for(int j = i * i; j < prime_9020.length; j += i) {
    			prime_9020[j] = true;
    		}
    	}
    }
	/*
	n > 123456 이므로 2n 은 최대 246912 이다.
	0 부터 시작하므로 246912 + 1
	*/
	public static boolean[] prime_4948 = new boolean[246913];
	// 5. 베르트랑 공준
	public static void baek_4948(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		get_prime_4948();	// 소수를 얻는 메소드 실행
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;	// n 이 0 일경우 종료
            
			int cnt = 0;	// 소수 개수를 셀 변수
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime_4948[i]) {
					cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	// 5번 에라토스테네스의 체 알고리즘
	public static void get_prime_4948() {
		// true = 소수아님 , false = 소수 
		prime_4948[0] = prime_4948[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime_4948.length); i++) {
			if(prime_4948[i]) {
				continue;
			}
			for(int j = i * i; j < prime_4948.length; j += i) {
				prime_4948[j] = true;
			}
		}
	}
	// 4. 소수 구하기
	public static boolean[] prime_1929;
	public static void baek_1929(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken()); // 시작 수
		int N = Integer.parseInt(st.nextToken()); // 끝 수
		// 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		prime_1929 = new boolean[N + 1];
		// 에라토스테네스의 체 알고리즘
		get_prime_1929();
		for(int i = M; i <= N; i++) {
			// false = 소수 
			if(!prime_1929[i]) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
	// 에라토스테네스의 체 알고리즘
	public static void get_prime_1929() {
		// true = 소수아님 , false = 소수 
		prime_1929[0] = prime_1929[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime_1929.length); i++) {
			if(prime_1929[i]) continue;
			for(int j = i * i; j < prime_1929.length; j += i) {
				prime_1929[j] = true;
			}
		}
	}
	// 3. 소인수분해
	public static void baek_11653(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 주어진 수
		// N이 1이 아닐 때
		if(N!=1) {
			for (int i = 2; i <= N; i++) {
				while (N%i==0) {
					bw.write(String.valueOf(i)); // 출력
					bw.newLine(); // 줄바꿈
					N = N/i;
				}
			}
		}
		bw.flush();
		bw.close();
	}
	// 2. 소수
	public static void baek_2581(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int M = Integer.parseInt(br.readLine()); // 시작 수
		int N = Integer.parseInt(br.readLine()); // 끝 수
		List<Integer> primeList = new ArrayList<Integer>(); // 리스트 생성
		for (int i = M; i <= N; i++) {
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			// 1은 소수가 아님.
			if(i == 1) {
				continue; // 다음 반복문으로
			}
			// 소수를 판별할 때 i의 제곱근 까지만 검사하면 된다.
			for (int j = 2; j <= Math.sqrt(i); j++) {
				// 나머지가 0이면 나누어 떨어지는 수 이므로 false 후 break
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			// true일 경우 primeList.add(i) 리스트에 i를 담아준다.;
			if (isPrime) {
				primeList.add(i);
			}
		}
		// 리스트가 비었을 때
		if (primeList.isEmpty()) {
			bw.write("-1"); // -1 출력
		}
		// primeList.get(0)가 빈 상태가 아닐 때 출력해줘야 할 것들
		else {
			int sum = 0; // 소수의 합
			int min = primeList.get(0); // M부터 시작해서 i++로 올라가기 때문에 리스트의 0번 째 에는 리스트의 소수 중 작은  수가 들어있음
			for (Integer pri : primeList) {
				sum+=pri;
			}
			bw.write(String.valueOf(sum)); // 합 출력
			bw.newLine(); // 줄바꿈
			bw.write(String.valueOf(min)); // 최소값 출력
		}
		bw.flush();
		bw.close();
	}
	// 1. 소수 찾기
	public static void baek_1978(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine()); // 주어진 수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0; // 소수의 개수
		for (int i = 0; i < N; i++) {
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken()); // 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
			// 1은 소수가 아님.
			if(num == 1) {
				continue; // 다음 반복문으로
			}
			// 소수를 판별할 때 num의 제곱근 까지만 검사하면 된다.
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if(num%j == 0) {
					isPrime = false;
					break;
				}
			}
			// true일 경우 cnt++;
			if (isPrime) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}
