import java.util.*;

public class Test002 {

	public static void main(String[] args) {
		// for - each��
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
				System.out.println("����ȯ");
			}
		}
		/*
		 * System.out.println("--------------------"); //�Է¹ޱ�
		 * System.out.print("��� ���� �Է��ϼ��� : "); Scanner sc = new Scanner(System.in); int
		 * number = sc.nextInt(); if(number == 5) { System.out.println("itzy"); }else
		 * if(number == 7) { System.out.println("BTS"); }else if(number == 9) {
		 * System.out.println("EXO"); }else if(number == 1) { System.out.println("IU");
		 * }else { System.out.println("����ȯ"); }
		 */

		// �ݺ������� �Է��� �������� �ް� ���� ���ڸ� �Է��ϸ� ����
		/*
		 * System.out.println("--------------------"); 
		 * while (true) { 
		 * Scanner sc = newScanner(System.in); 
		 * System.out.print("��� ���� �Է��ϼ��� : "); 
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
		 * System.out.println("����ȯ"); 
		 * } else { System.out.println("���Դϴ�."); 
		 * break; } 
		 * }
		 */

		// ���� while���� for������ �ٲٱ�
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.print("��� ���� �Է��ϼ��� : ");
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
				System.out.println("����ȯ");
			} else {
				System.out.println("���Դϴ�.");
				break;
			}
		}
		System.out.println("--------------------");
		//��ȣ �Է��ϸ�, �츮�� �л� �̸��� �������
		
		
	}

}
