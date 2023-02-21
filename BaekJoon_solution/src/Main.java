import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
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
}

class others{
	// 12. 좌표압축
	public static void baek_18870(String[] args) throws IOException {
		
	}
	// 11. 나이순 정렬
	public static void baek_10814(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken(); // 나이
			arr[i][1] = st.nextToken(); // 이름
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			// 나이순으로 정렬
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
			
		});
		for(int i = 0; i < N; i++) {
			bw.append(arr[i][0]).append(' ').append(arr[i][1]);
			bw.newLine();
		}
		bw.flush();
	}
	// 10. 단어정렬
	public static void baek_1181(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				// 1. 길이가 같은 경우
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				// 2. 다른 경우 o1의 길이 - o2의 길이를 리턴
				else {
					return o1.length() - o2.length();
				}
			}
			
		});
		bw.write(arr[0]);
		bw.newLine();
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				bw.write(arr[i]);
				bw.newLine();
			}
		}
		bw.flush();
	}
	// 9. 좌표정렬하기 2
	public static void baek_11651(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][0] = a;
			arr[i][1] = b;
		}
		// 람다식 사용
		Arrays.sort(arr, (el1, el2) -> {
			if(el1[1] == el2[1]) {
				return el1[0] - el2[0];
			} else {
				return el1[1] - el2[1];
			}
		});
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]);
			bw.newLine();
		}
		bw.flush();
	}
	// 8. 좌표정렬하기
	public static void baek_11650(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][0] = a;
			arr[i][1] = b;
		}
		// 람다식 사용
		Arrays.sort(arr, (el1, el2) -> {
			if(el1[0] == el2[0]) {
				return el1[1] - el2[1];
			} else {
				return el1[0] - el2[0];
			}
		});
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]);
			bw.newLine();
		}
		bw.flush();
	}
	// 7. 소트인사이드
	public static void baek_1427(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		String[] arr = br.readLine().split(""); // N은 1,000,000,000보다 작거나 같은 자연수이다
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			bw.write(arr[i]);
		}
		bw.flush();
	}
	// 6. 통계학
	public static void baek_2108(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001]; // 정수의 절댓값은 4000을 넘지 않는다. -4000~4000 = 8001
		int[] arr2 = new int[N];
		int avg = 0; // 중앙 값
		int max = Integer.MIN_VALUE; // 최대 값
		int min = Integer.MAX_VALUE; // 최소 값
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			avg += a; // 산술평균 값 구하기
			arr2[i] += a;
			arr[a+4000]++; // 최빈값 구하기
			
			// 최대 값
        	if(max < a){
                max = a;
        	}
        	// 최소 값
        	if (min > a) {
        		min = a;
			}
		}
		int mode = 10000;
		int modeMax = 0; 	// 최빈값의 최댓값  
		// 이전의 동일한 최빈값이 한 번만 등장했을경우 true or false
		boolean flag = false;
		for(int i = min+4000; i <= max+4000; i++) {
			if(arr[i] > 0) {
				if(modeMax < arr[i]) {
					modeMax = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(modeMax == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		// 1. 산술평균
		bw.write(Integer.toString((int)Math.round((double)avg/N)));
		bw.newLine();
		// 2. 중앙값
		Arrays.sort(arr2); // 오름차순 정렬
		bw.write(Integer.toString(arr2[N/2]));
		bw.newLine();
		// 3. 최빈값
		bw.write(Integer.toString(mode));
		bw.newLine();
		// 4. 범위
		bw.write(Integer.toString(max-min));
		bw.flush();
	}
	// 5. 수 정렬하기3
	public static void baek_10989(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int[] arr2 = new int[N];
		int avg = 0; // 중앙 값
		int max = Integer.MIN_VALUE;
		int cnt = 0; // 최빈 값
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
			avg += a;
		}
		// 1. 산술평균
		bw.write(Integer.toString(avg/N));
		Arrays.sort(arr); // 오름차순 정렬
		// 2. 중앙값
		bw.write(Integer.toString(arr[(N/2)+1]));
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]]++;
		}
		for (int i = 0; i < arr2.length; i++) {
        	if(max < arr2[i]){
                max = arr2[i];
            	cnt = i;
        	}
		}
		bw.write(Integer.toString(cnt));
		
		bw.flush();
	}
	// 4. 수 정렬하기2
	public static void baek_2751(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>(); // 입력 값 받아줄 배열
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			list.add(a);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write(Integer.toString(list.get(i)));
			bw.newLine();
		}
		bw.flush();
	}
	// 3. 커트라인
	public static void baek_25305(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N]; // 입력 값 받아줄 배열
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		Arrays.sort(arr);
		bw.write(Integer.toString(arr[N-K]));
		bw.flush();
	}
	// 2. 대표값2
	public static void baek_2587(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[5]; // 입력 값 받아줄 배열
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
		}
		int res1 = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
		Arrays.sort(arr);
		bw.write(Integer.toString(res1));
		bw.newLine();
		bw.write(Integer.toString(arr[2]));
		bw.flush();
	}
	// 1. 수 정렬하기
	public static void baek_2738(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			bw.write(Integer.toString(arr[i]));
			bw.newLine();
		}
		bw.flush();
	}
}