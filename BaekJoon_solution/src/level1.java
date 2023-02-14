import java.io.*;
import java.util.*;

public class level1 {
	// 14. 새싹
	public static void baek_25083(String[] args) throws IOException {
		// 새싹을 출력한다.
		System.out.println("         ,r'\"7");
		System.out.println("r`-_   ,'  ,/");
		System.out.println(" \\. \". L_r'");
		System.out.println("   `~\\/");
		System.out.println("      |");
		System.out.println("      |");
	}
	// 13. 개
	public static void baek_10172(String[] args) throws IOException {
		// 개를 출력한다.
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	// 12. 고양이
	public static void baek_10171(String[] args) throws IOException {
		// 고양이를 출력한다.
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	// 11. 곱셈
	public static void baek_2588(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		String[] splB = String.valueOf(B).split("");
		
		// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		System.out.println(A*Integer.parseInt(splB[2]));
		System.out.println(A*Integer.parseInt(splB[1]));
		System.out.println(A*Integer.parseInt(splB[0]));
		System.out.println(A*B);
	}
	// 10. 나머지
	public static void baek_10430(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		// 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		System.out.println((A+B)%C);
		System.out.println(((A%C)+(B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C)*(B%C))%C);
	}
	// 9. 킹, 퀸, 룩, 비숍, 나이트, 폰
	public static void baek_3003(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int a = Integer.parseInt(st.nextToken()); // 킹 1개
		int b = Integer.parseInt(st.nextToken()); // 퀸 1개
		int c = Integer.parseInt(st.nextToken()); // 룩 2개
		int d = Integer.parseInt(st.nextToken()); // 비숍 2개
		int e = Integer.parseInt(st.nextToken()); // 나이트 2개
		int f = Integer.parseInt(st.nextToken()); // 폰 8개
		// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
		System.out.print((1-a)+" "+(1-b)+" "+(2-c)+" "+(2-d)+" "+(2-e)+" "+(8-f));
	}
	// 8. 1998년생인 내가 태국에서는 2541년생?!
	public static void baek_18108(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int a = Integer.parseInt(st.nextToken());
		// 태국불기는 543을 빼준다.
		System.out.print(a-543);
	}
	// 7. ??!
	public static void baek_10926(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		String str = st.nextToken();
		// 첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
		System.out.print(str+"??!");
	}
	// 6. 사칙연산
	public static void baek_10869(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		System.out.print((A+B)+"\n"+(A-B)+"\n"+(A*B)+"\n"+(A/B)+"\n"+(A%B));
	}
	// 5. A/B
	public static void baek_1008(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		System.out.println(A/B); // A와 B를 나눈다.
	}
	// 4. AxB
	public static void baek_10998(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		System.out.println(A*B); // A와 B를 곱한다.
	}
	// 3. A-B
	public static void baek_1001(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		System.out.println(A-B); // A와 B를 뺀다.
	}
	// 2. A+B
	public static void baek_1000(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		System.out.println(A+B); // A와 B를 더한다.
	}
	// 1. Hello World
	public static void baek_2557(String[] args) {
		System.out.print("Hello World!");
	}
}
