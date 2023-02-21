import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class level9 {
	// 3. 색종이
		public static void baek_2563(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
			int colpapLen = Integer.parseInt(br.readLine()); // 색종이 개수
			int[][] paper = new int [101][101]; // 도화지
			int cnt = 0;
			for (int i = 0; i < colpapLen; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이라 길이에 +10을해준다.
				for (int j = a; j < a+10; j++) {
					// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이라 길이에 +10을해준다.
					for (int j2 = b; j2 < b+10; j2++) {
	                    // 0일 때 카운트 ++
						if (paper[j][j2] == 0) {
	                    	paper[j][j2]++;
	                    	cnt++;
	                    }
					}
				}
			}
			bw.write(Integer.toString(cnt));
			bw.flush();
		}
		// 2. 최댓값
		public static void baek_2566(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
			int[][] arr = new int[9][9];
			for (int i = 0; i < arr.length; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < arr[i].length; j++) {
					int a = Integer.parseInt(st.nextToken());
					arr[i][j] = a;
				}
			}
			int max  = Integer.MIN_VALUE; // 최대값
			int line = 0; // 행 번호 
			int row  = 0; // 열 번호
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					// 변수에 저장된 최대값보다 클 때
					if(max < arr[i][j]) {
						max  = arr[i][j]; // 최대값 교체
						line = i+1; // 1부터 시작하니깐 +1을 해준다.
						row  = j+1; // 1부터 시작하니깐 +1을 해준다.
					}
				}
			}
			bw.write(Integer.toString(max));
			bw.newLine();
			bw.write(String.valueOf(line+" "+row));
			bw.flush();
		}
		// 1.  행렬 덧셈
		public static void baek_2738(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		    int N = Integer.parseInt(st.nextToken());
		    int M = Integer.parseInt(st.nextToken());
		    
		    int[][] A = new int[N][M];
		    int[][] B = new int[N][M];
		    
		    for(int i = 0; i < N; i++) {
		    	st = new StringTokenizer(br.readLine());
		    	for(int j = 0; j < M; j++) {
		    		A[i][j] = Integer.parseInt(st.nextToken());
		    	}
		    }
		    
		    for(int i = 0; i < N; i++) {
		    	st = new StringTokenizer(br.readLine());
		    	for(int j = 0; j < M; j++) {
		    		B[i][j] = Integer.parseInt(st.nextToken());
		    	}
		    }
		    
		    for(int i = 0; i < N; i++) {
		    	for(int j = 0; j < M; j++) {
		    		bw.write((A[i][j] + B[i][j]) + " ");
		    	}
		    	bw.newLine();
		    }
		    bw.flush();
		}
}
