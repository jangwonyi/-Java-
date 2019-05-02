package kr.hs.emirim.studentnumbertomajor;
import java.util.Scanner;

public class StudentNumberMajor {
	
	public static void main(String[] args) {
		
		 String[] 학년3 = {"인터랙티브미디어과", "인터랙티브미디어과","뉴미디어디자인과","뉴미디어디자인과","뉴미디어솔루션과","뉴미디어솔루션과"};
		 String[] 학년2 = {"뉴미디어소프트웨어과", "뉴미디어소프트웨어과","뉴미디어웹솔루션과","뉴미디어웹솔루션과","뉴미디어디자인과","뉴미디어디자인과"};
		
		//학번 입력받기
		//학과 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("학번을 입력하시오 : ");
		String n = sc.nextLine();
		
		/*
		 * String a = n.charAt(0);
		 * 
		 * if(n.charAt(0) == 3) {
		 * 
		 * }
		 */
		
		//0번째 글자가 3이면 
			//1, 2는 인디과, 3,4반은 뉴디, 5,6반은 뉴솔
		//0번째 글자가 3이 아니면
			//1, 2는 뉴솦, 3,4반은 뉴솔, 5,6반은 뉴디
		
		
		//substring 사용법
//		if(n.substring(0, 1).equals("3")) {
//			
//		}
		
//		if(n.charAt(0) == '3') {
//			if(n.charAt(1) == '1' || n.charAt(1) == '2') {
//				System.out.println("인터렉티브미디어과");
//			}else if(n.charAt(1) == '3' ||  n.charAt(1) == '4') {
//				System.out.println("뉴미디어디자인과");
//			}else {
//				System.out.println("뉴미디어솔루션과");
//			}
//		}else if(n.charAt(0) == '2'){
//			if(n.charAt(1) == '1' || n.charAt(1) == '2') {
//				System.out.println("뉴미디어소프트웨어과");
//			}else if(n.charAt(1) == '3' || n.charAt(1) == '4') {
//				System.out.println("뉴미디어웹솔루션과");
//			}else {
//				System.out.println("뉴미디어디자인과");
//			}	
//		}
		
		if(n.substring(0, 1).equals("3")) {
			
			String classroomStr = n.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년3[classroom]);

		}else {
			
			String classroomStr = n.substring(1, 2);
			int classroom = Integer.parseInt(classroomStr)-1;
			System.out.println(학년2[classroom]);
			
		}
	}
}
