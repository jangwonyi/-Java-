package kr.hs.emirim.studentnumbertomajor;
import java.util.Scanner;

public class StudentNumberMajor {
	
	public static void main(String[] args) {
		
		 String[] �г�3 = {"���ͷ�Ƽ��̵���", "���ͷ�Ƽ��̵���","���̵������ΰ�","���̵������ΰ�","���̵��ַ�ǰ�","���̵��ַ�ǰ�"};
		 String[] �г�2 = {"���̵�����Ʈ�����", "���̵�����Ʈ�����","���̵�����ַ�ǰ�","���̵�����ַ�ǰ�","���̵������ΰ�","���̵������ΰ�"};
		
		//�й� �Է¹ޱ�
		//�а� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�й��� �Է��Ͻÿ� : ");
		String n = sc.nextLine();
		
		/*
		 * String a = n.charAt(0);
		 * 
		 * if(n.charAt(0) == 3) {
		 * 
		 * }
		 */
		
		//0��° ���ڰ� 3�̸� 
			//1, 2�� �ε��, 3,4���� ����, 5,6���� ����
		//0��° ���ڰ� 3�� �ƴϸ�
			//1, 2�� ����, 3,4���� ����, 5,6���� ����
		
		
		//substring ����
//		if(n.substring(0, 1).equals("3")) {
//			
//		}
		
//		if(n.charAt(0) == '3') {
//			if(n.charAt(1) == '1' || n.charAt(1) == '2') {
//				System.out.println("���ͷ�Ƽ��̵���");
//			}else if(n.charAt(1) == '3' ||  n.charAt(1) == '4') {
//				System.out.println("���̵������ΰ�");
//			}else {
//				System.out.println("���̵��ַ�ǰ�");
//			}
//		}else if(n.charAt(0) == '2'){
//			if(n.charAt(1) == '1' || n.charAt(1) == '2') {
//				System.out.println("���̵�����Ʈ�����");
//			}else if(n.charAt(1) == '3' || n.charAt(1) == '4') {
//				System.out.println("���̵�����ַ�ǰ�");
//			}else {
//				System.out.println("���̵������ΰ�");
//			}	
//		}
		
		if(n.substring(0, 1).equals("3")) {
			
			String classroomStr = n.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(�г�3[classroom]);

		}else {
			
			String classroomStr = n.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(�г�2[classroom]);
			
		}
	}
}
