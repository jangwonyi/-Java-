package Program;

import java.io.IOException;
import java.util.Scanner;

public class IOProgram {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputString = sc.nextLine(); //입력 : 초록
//		System.out.println(inputString); //출력 : 검정	
//		System.err.println(inputString); //에러 : 빨강
				
		int bt;
		try {
//			bt = System.in.read(); //read() : 한 글자를 읽음(한 int값을 읽음)
			     
			while((bt = System.in.read()) != 'x') {
			System.out.println((char)bt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
