package Program;

import java.io.IOException;
import java.util.Scanner;

public class IOProgram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = sc.nextLine(); //�Է� : �ʷ�
//		System.out.println(inputString); //��� : ����	
//		System.err.println(inputString); //���� : ����
		
		int bt;
		try {
//			bt = System.in.read(); //read() : �� ���ڸ� ����(�� int���� ����)
			     
			while((bt = System.in.read()) != 'x') {
			System.out.println((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}