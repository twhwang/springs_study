// while문 (7단을 while문으로 작성)
public class p0319_01 {
	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 9; ++i) {
		      System.out.printf("7 * %d  = %d%n", i , 7*i);
		    }
		    */
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("7 * %d  = %d%n", i , 7*i);
			i++;
		}
	}
}

// while문
public class p0319_01_2 {
	public static void main(String[] args) {
		// i가 0이 아닐 때까지 문장을 반복한다
		int i = 5;
		while (i--!=0) {
			System.out.println(i + " : I can do it!");
		}
		System.out.println();
		// 1부터 몇까지 더해야 100을 넘지 않는지 알아내는 예제
		int sum = 0;
		int j = 0;
		while(sum <= 100) {
			System.out.printf("%d - %d%n", j, sum);	
			sum += ++j;
		}
	}
}

// while (무한 입력 시스템 *quit를 입력 시에는 시스템 종료)
import java.util.Scanner;
public class p0319_01_3 {
	public static void main2(String[] args) {
		Scanner sc = new Scanner (System.in);
		String as;
		
		while(true) {
			System.out.println("문장을 입력하시오 (종료는 quit) : ");
			as = sc.nextLine();
			System.out.println("[" + as + "]");
			if(as.equals("quit")) {
				break;
			}
		}
		sc.close();
	} // main문(break문) 종료
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String as;
		
		while(true) {
			System.out.println("문장을 입력하시오 (종료는 quit) : ");
			as = sc.nextLine();
			System.out.println("[" + as + "]");
			if(!as.equals("quit")) {
				continue; // 아래 코드를 수행하지 않고 반복문의 제일 처음으로 이동
			}
			break;
		}
		sc.close();
	} // main1문(continue) 종료
}

// break-continue
import java.util.Scanner;
public class p0319_01_4 {
	public static void main(String[] agrs) {
		int menu = 0;
		
		Scanner scan = new Scanner (System.in);
		
		while(true) {
			System.out.println("1. 사각형");
			System.out.println("2. 세모");
			System.out.println("3. 동그라미");
			System.out.print("원하는 형태의 번호를 입력하시오 (종료:0) >");
			
			String cup = scan.nextLine();
			menu = Integer.parseInt(cup);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("명령이 잘못 되었습니다. (종료:0) >");
				continue;
			}
			
			System.out.println("선택하신 형태는 " + menu + "번 입니다.");
			scan.close();
			
		} // 반복문
	}
}

// 이름붙은 반복문
public class p0319_02 {
	public static void main(String[] args) {
		
		Loop1 :
			for (int i = 2 ; i <= 9 ; i++) {
				for (int j = 1 ; j <= 9 ; j++) {
					if (j==5) 
						break Loop1;
						//break;
						//continue Loop1;
						//continue;
					System.out.printf("%d × %d = %d%n", i, j, i*j);
				}
				System.out.println();
			}
		}
}

import java.util.Scanner;
public class p0319_03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 섭씨를 입력받은 후 화씨로 바꾸시오.
		Scanner scan = new Scanner (System.in);
		while(true) {
			double cel = 0;
			System.out.println("현재 온도를 섭씨(℃)로 입력하시오. >");
			String temp = scan.nextLine();
			cel = Double.parseDouble(temp);
			double fah =  Math.round((cel*1.8)+32);
			System.out.println("현재 온도는 화씨(℉) " + fah + "도 입니다.");
			System.out.println(" ");
		}
	}
}

// 배열
public class p0319_04 {
	public static void main(String[] args) {
		int[] Num = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < Num.length ; i++) {
			System.out.println(Num[i]);
		}
	}
}

// 배열의 활용 - 로또 번호 만들기
public class p0319_04_2 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		// 45개의 정수 ball 생성
		for(int i = 0 ; i < ball.length ; i++) 
			ball[i] = i+1; // ball[0]에 1이 저장
			int tmp = 0; // 두 값을 바꾸는 데 사용할 임시 변수
			int j = 0; // 임의 값을 얻어서 저장할 변수
			
		for(int i = 0 ; i < 6 ; i++) {
			j = (int)(Math.random() * 45); // 0~44범위의 임의값을 얻는다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp; // ball[i]와 ball[j]의 값을 서로 바꾼다.
		}
		
		// 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
		for(int i = 0 ; i < 6 ; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}

//String의 배열
public class p0319_04_3 {
	public static void main(String[] args) {
		String[] names = {"kim","Yi","Park"};
		
		for (int i = 0 ; i < names.length ; i++) {
			System.out.println("names<" + i + "> : " + names[i]);
		}
		String tmp = names[2];
		System.out.println("username : "+ tmp);
		names[0] = "Yu";
		
		for (int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}
		
	}
}

// 커맨드 라인을 통해 입력받기
public class p0319_05 {
	public static void main(String[] args) {
		System.out.println("매개변수의 개수 :" + args.length);
		for(int i = 0 ; i < args.length ; i++){
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
