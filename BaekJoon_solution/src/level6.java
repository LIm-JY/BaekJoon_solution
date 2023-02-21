import java.io.*;
import java.util.*;

public class level6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   // 그룹단어체커 메소드를 위해 선언
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 그룹단어체커 메소드를 위해 선언
	// 10-1. 그룹 단어 체커
	public static void baek_1316(String[] args) throws IOException {
		int len = Integer.parseInt(br.readLine());
		int cnt = 0;
 
		for (int i = 0; i < len; i++) {
			if (check()) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
	// 10-2. 그룹 단어 체커 체크 메소드
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if(prev != now) {
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if(!check[now - 97]){
					check[now - 97] = true;	// true 로 바꿔준다
					prev = now;				// 다음 턴을 위해 prev 도 바꿔준다 
				}
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else {
					return false;	//함수 종료
				}
			}
			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
			else {
				continue;
			}
		}
		return true;
	}
	
	// 9. 크로아티아 알파벳
	public static void baek_2941(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String alph = st.nextToken();
		alph = alph.replaceAll("c=", "1");
		alph = alph.replaceAll("c-", "1");
		alph = alph.replaceAll("dz=", "1");
		alph = alph.replaceAll("d-", "1");
		alph = alph.replaceAll("lj", "1");
		alph = alph.replaceAll("nj", "1");
		alph = alph.replaceAll("s=", "1");
		alph = alph.replaceAll("z=", "1");
		
		bw.write(String.valueOf(alph.length()));
		
		bw.flush();
		bw.close();
	}
	// 8. 다이얼
	public static void baek_5622(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String[] splStrArr = st.nextToken().split("");
		
		int sum = 0;
		for (String alph : splStrArr) {
        	sum += 2; // for문 초기화 될 때마다 2를 더해줌
        	// case에 break를 걸지 않아서 sum++
			switch (alph) {
            	case "W": case "X": case "Y": case "Z":
            		sum ++;
            	case "T": case "U": case "V":
            		sum ++;
            	case "P": case "Q": case "R": case "S":
            		sum ++;
            	case "M": case "N": case "O":
            		sum ++;
            	case "J": case "K": case "L":
            		sum ++;
            	case "G": case "H": case "I":
            		sum ++;
            	case "D": case "E": case "F":
            		sum ++;
            	case "A": case "B": case "C":
            		sum ++;
            	default:
            		break;
        	}	
		
		}
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
	}
	// 7. 상수
	public static void baek_2908(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String[] fst = st.nextToken().split("");
		String[] sec = st.nextToken().split("");
		StringBuilder sbFst = new StringBuilder();
		StringBuilder sbSec = new StringBuilder();
		for (int i = fst.length-1; i >= 0; i--) {
			sbFst.append(fst[i]);
		}
		for (int i = sec.length-1; i >= 0; i--) {
			sbSec.append(sec[i]);
		}
		// 첫번 째가 두번 째 보다 클 때
		if(Integer.parseInt(sbFst.toString()) > Integer.parseInt(sbSec.toString())) {
			bw.write(sbFst.toString());
		}else {
			bw.write(sbSec.toString());
		}
		bw.flush();
		bw.close();
	}
	// 6. 단어의 개수
	public static void baek_1152(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		bw.write(String.valueOf(st.countTokens()));
		bw.flush();
		bw.close();
	}
	// 5. 단어 공부
	public static void baek_1157(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[26]; // 영문자의 개수는 26개
		char[] strArr = st.nextToken().toUpperCase().toCharArray(); // 대문자로 변경하여 charArray 선언
		
		for (int i = 0; i < strArr.length; i++) {
			// 대문자 범위 65~90
			if (65 <= strArr[i] && strArr[i] <= 90) {
				// 범위에 해당하는 인덱스 값 - 65 증가 (ex A-65 = 0)
				arr[strArr[i]-65]++;
			}
		}
		int max = Integer.MIN_VALUE; // max는 int의 가장 작은 value로 초기화
		char ch = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		bw.append(ch);
		bw.flush();
		bw.close();
	}
	// 4. 문자열 반복
	public static void baek_2675(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < len; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			char[] arr = st.nextToken().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < a; j2++) {
					bw.write(arr[j]);
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	// 3. 알파벳 찾기
	public static void baek_10809(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		char[] chArr = br.readLine().toCharArray();
		int[] arr = new int[26]; // 소문자의 개수만큼
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < chArr.length; i++) {
			if(arr[chArr[i] - 'a'] == -1) {
				arr[chArr[i] - 'a'] = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
    		bw.write(String.valueOf(arr[i])+" ");
		}
		bw.flush();
		bw.close();
	}
	// 2. 숫자의 합
	public static void baek_11720(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		String[] splStr = br.readLine().split(""); // 문자열을 공백으로 스플릿
		if(splStr.length != len) {
			bw.write("문자열 길이가 다름");
		}
		int sum = 0; // splStr의 합
		for (int i = 0; i < splStr.length; i++) {
			sum += Integer.parseInt(splStr[i]);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
	// 1. 아스키 코드
	public static void baek_11654(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		System.out.println((int)br.readLine().charAt(0));
	}
}
