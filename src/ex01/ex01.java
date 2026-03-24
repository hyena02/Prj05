package ex01;

public class ex01 {
	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 2;
		int result;
		result = ex01.add(7, 2);
		System.out.println(result);

		result = ex01.add(n1, n2, 5);
		System.out.println(result);
		
	}
// 객체 지향프로그램의 overloading :
// 함수의 signature 가 다르면 여러개 만들 수 있다
	private static int add(int v1, int v2, int v3) {
		return v1 + v2 + v3;
	}

	private static int add(int v1, int v2) {
		return v1 + v2 ;
	}
}
