
public class Test_If {
	public static void main(String[] args) {
		int number = 13;
		//if문으로 number가 5이면, itzy 출력
		//number가 7이면, BTS 출력
		//number가 9이면, EXO 출력
		//number가 1이면, IU 출력
		//number가 13이면, Seventeen 출력
		
		if(number == 5) {
			System.out.println("itzy");
		}else if(number == 7) {
			System.out.println("BTS");
		}else if(number == 9) {
			System.out.println("EXO");
		}else if(number == 1) {
			System.out.println("IU");
		}else {
			System.out.println("김재환");
		}
		
		System.out.println("--------------------");
		
		//switch문으로 바꾸기
		switch (number) {
		case 5:
			System.out.println("itzy");
			break; 
			
		case 7:
			System.out.println("BTS");
			break;
			
		case 9:
			System.out.println("EXO");
			break;
			
		case 1:
			System.out.println("IU");
			break;
			
		default:
			System.out.println("김재환");
			break;
		}
		
		System.out.println("--------------------");
		//반복문 구구단 2단 출력
		
		for(int i=2; i<=2; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+" "+"x"+" "+j+" "+"="+" "+(i*j)); 
			}
		}
		
		//while문 구구단 2단 출력
		System.out.println("--------------------");
		int i = 2, j = 1;
		while(i<=2) {
			while(j<=9) {
				System.out.println(i+" "+"x"+" "+j+" "+"="+" "+(i*j));
				j++;
			}
		}
		
		//"
		System.out.println("--------------------");
		int dan = 2;
		int n = 1;
		while(n<=9) {
			System.out.println(dan+" "+"x"+" "+n+" "+"="+" "+(dan*n));
			n++;
		}
		
		//for - each문
		System.out.println("--------------------");
		int arr[] = new int[] {5, 7, 9, 1, 13};
		for(int a : arr) {
			System.out.println(a+" ");
			number = a;
			if(number == 5) {
				System.out.println("itzy");
			}else if(number == 7) {
				System.out.println("BTS");
			}else if(number == 9) {
				System.out.println("EXO");
			}else if(number == 1) {
				System.out.println("IU");
			}else {
				System.out.println("김재환");
			}
		}
	}
}
