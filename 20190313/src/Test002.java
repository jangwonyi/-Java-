import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		// for - each문
		int member = 13;
		System.out.println("--------------------");
		int arr[] = new int[] { 5, 7, 9, 1, 13 };
		for (int a : arr) {
			System.out.println(a + " ");
			member = a;
			if (member == 5) {
				System.out.println("itzy");
			} else if (member == 7) {
				System.out.println("BTS");
			} else if (member == 9) {
				System.out.println("EXO");
			} else if (member == 1) {
				System.out.println("IU");
			} else {
				System.out.println("김재환");
			}
		}
		/*
		 * System.out.println("--------------------"); //입력받기
		 * System.out.print("멤버 수를 입력하세요 : "); Scanner sc = new Scanner(System.in); int
		 * number = sc.nextInt(); if(number == 5) { System.out.println("itzy"); }else
		 * if(number == 7) { System.out.println("BTS"); }else if(number == 9) {
		 * System.out.println("EXO"); }else if(number == 1) { System.out.println("IU");
		 * }else { System.out.println("김재환"); }
		 */

		// 반복문으로 입력을 무한으로 받고 없는 숫자를 입력하면 멈춤
		/*
		 * System.out.println("--------------------"); 
		 * while (true) { 
		 * Scanner sc = newScanner(System.in); 
		 * System.out.print("멤버 수를 입력하세요 : "); 
		 * int number = sc.nextInt(); 
		 * if (number == 5) { 
		 * System.out.println("itzy"); 
		 * } else if(number == 7) { 
		 * System.out.println("BTS"); 
		 * } else if (number == 9) {
		 * System.out.println("EXO"); 
		 * } else if (number == 1) {
		 * System.out.println("IU"); 
		 * } else if (number == 13) {
		 * System.out.println("김재환"); 
		 * } else { System.out.println("끝입니다."); 
		 * break; } 
		 * }
		 */

		// 위의 while문을 for문으로 바꾸기
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("멤버 수를 입력하세요 : ");
			int number = sc.nextInt();
			if (number == 5) {
				System.out.println("itzy");
			} else if (number == 7) {
				System.out.println("BTS");
			} else if (number == 9) {
				System.out.println("EXO");
			} else if (number == 1) {
				System.out.println("IU");
			} else if (number == 13) {
				System.out.println("김재환");
			} else {
				System.out.println("끝입니다.");
				break;
			}
		}
		System.out.println("--------------------");
		//번호 입력하면, 우리반 학생 이름을 출력하자
		
		
	}

}
