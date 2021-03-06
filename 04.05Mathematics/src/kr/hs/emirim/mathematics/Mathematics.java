package kr.hs.emirim.mathematics;

import java.util.Random;

public class Mathematics {

	public static void main(String[] args) {
		System.out.println(Math.abs(25));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
		System.out.println("------------------------------");
		
		//round()
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4));
		System.out.println(Math.round(-25.5));
		System.out.println(Math.round(-25.6));
		System.out.println("------------------------------");
		
		//pow()
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.pow(3.0f, 2.0f));
		System.out.println(Math.pow(5.0, 2));
		System.out.println(Math.pow(-5.0, 3.0));
		
		//sqrt()
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		
		//random()
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(	(int)Math.random()*5);
		System.out.println((int)Math.random()*5);
		System.out.println((int)Math.random()*10);
		System.out.println((int)Math.random()*100);
		
		//random() 클래스
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		int start = 100;
		int end = 999;
		int randomNumber100to999 = random.nextInt(end - start + 1)+start; //start -> end 까지의 임의의 정수
	}

}
