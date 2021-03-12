class Ex2_1{
	public static void main(String args[]) {
		System.out.println("Hello, World!");
		System.out.print("Hello, ");
		System.out.println("World!");
	}
}
/*
결과값
Hello, World!
Hello, World!
*/

public class Ex2_2 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.print("3 + 5 = ");
		System.out.println(3+5);
	}
}
/*
결과값
Hello, World!
3 + 5 = 8
*/

public class Ex2_2_2 {
	public static void main(String[] args) {
		System.out.println("*******************");
		System.out.println("*      *****      *");
		System.out.println("*    **     **    *");
		System.out.println("*    **     **    *");
		System.out.println("*      *****      *");
		System.out.println("*                 *");
		System.out.println("*   ***********   *");
		System.out.println("*       ***       *");
		System.out.println("*       ***       *");
		System.out.println("*                 *");
		System.out.println("*      *****      *");
		System.out.println("*    **     **    *");
		System.out.println("*    **     **    *");
		System.out.println("*      *****      *");
		System.out.println("*******************");
	}
}
/*
결과값
*******************
*      *****      *
*    **     **    *
*    **     **    *
*      *****      *
*                 *
*   ***********   *
*       ***       *
*       ***       *
*                 *
*      *****      *
*    **     **    *
*    **     **    *
*      *****      *
*******************
*/


public class Ex2_3 {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
	}
}
/*
결과값
8
2
15
1
*/

public class Ex2_4 {
	public static void main(String[] args) {
		int x = 100; // 값이 정수일 경우에는 'int'
		double pi = 3.14; // 값이 실수일 경우에는 'double'
		char ch = 'a';// 괄'문자(1개)를 저장할 변수의 타입은 'char'
		String str = "word"; // 여러 문자(0~n개)를 저장할 변수의 타입은 'String'
		String name = "Ja" + "va";
		String ver_add = name + 8.0;

		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(name);
		System.out.println(ver_add);
	}
}
/*
결과값
100
3.14
a
word
Java
Java8.0
*/

public class Ex2_5 {
	public static void main(String[] args) {
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}
/*
결과값
7 
 7
7
7

14
77
*/

public class Ex2_6 {
	public static void main(String[] args) {
		int x = 5, y =10; // 변수 x, y에 각각 5, 10을 저장
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int tmp = x; // x값 5를 tmp에 저장
		x = y; // y값 10을 x에 저장
		y = tmp; // tmp값(이동한 x값 5)을 y에 저장
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
/*
결과값
x=5
y=10
x=10
y=5
*/
