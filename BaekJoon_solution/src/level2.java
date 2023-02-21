import java.io.*;
import java.util.*;

public class level2 {
	// 8. 주사위 세개
	public static void baek_2480(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		// 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		// 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		// 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		int answer = 0;
		if(a==b||a==c||b==c) {
			if(a==b) {
				answer = 1000 + a*100;
			}
			if(a==c) {
				answer = 1000 + a*100;
			}
			if(b==c) {
				answer = 1000 + b*100;
			}
			if(a==b&&b==c) {
				answer = 10000 + a*1000;
			}
		}else {
			// a가 b보다 클 때
			if(a>b) {
				// a가 c보다 클 때
				if(a>c) {
					answer = a*100;
				}else {
					answer = c*100;
				}
			}
			// a가 b보다 작을 때
			else {
				// b가 c보다 클 때
				if(b>c) {
					answer = b*100;
				}else {
					answer = c*100;
				}
			}
		}
		System.out.println(answer);
	}
	// 6. 오븐 시계
	public static void baek_2525(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int cookTime = Integer.parseInt(br.readLine());
		int cookHour = (min + cookTime) / 60;
		
		// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		int a = hour+cookHour;
		if(a > 23){
			a -= 24;
		}
		// 분 + 쿠킹시간이 60보다 크거나 같을 때
		if(min + cookTime>=60) {
			System.out.println(a+" "+((int)(min+cookTime)-(int)(60*cookHour)));
		}else {
			System.out.println(a+" "+(int)(min+cookTime));
		}
	}
	// 5. 알람 시계
	public static void baek_2884(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		// 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
		// 분이 45보다 클 때
		if(min >= 45) {
			System.out.println(hour+" "+((int)min-45));
		}else {
			min += 60;
			if(hour == 0) {
				hour = 24;
			}
			System.out.println(hour-1+" "+((int)min-45));
		}
	}
	// 4. 사분면고르기
	public static void baek_14681(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int answer = 0;
        // 1. x가 양수일 때
        if(x>0) {
    	// 1-1 y가 양수일 때
        answer = 1;
        	// 1-2 y가 음수일 때
        	if(y<0) {
        		answer = 4;
            }
        }
        // 2. x가 음수일 때
        if(x<0) {
    	// 2-1 y가 양수일 때
        answer = 2;
        	// 2-2 y가 음수일 때
        	if(y<0) {
        		answer = 3;
            }
        }
		System.out.println(answer);
	}
	// 3. 윤년
	public static void baek_2753(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = 0;
		// 1. 4의 배수이며
		if(a%4==0) {
			if (a%100!=0 || a%400==0) {
				b = 1;
			}
		}
		// 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		System.out.println(b);
	}
	// 2. 시험성적
	public static void baek_9498(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		String s = null;
		if(a<60) {
			s = "F";
		}
		if(a>=60) {
			s = "D";
		}
		if(a>=70) {
			s = "C";
		}
		if(a>=80) {
			s = "B";
		}
		if(a>=90) {
			s = "A";
		}
		// 시험 성적을 출력한다.
		System.out.println(s);
	}
	// 1. 두수 비교하기
	public static void baek_1330(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// 1. A가 B보다 클 때
		if(A > B) {
			System.out.print(">");
		}
		// 2. A가 B보다 작을 때
		if(A < B) {
			System.out.print("<");
		}
		// 3. A랑 B가 같을 때
		if(A == B) {
			System.out.print("==");
		}
	}
}
