package test.main;

import java.util.Random;

public class MainClass01 {
	public static void main(String[] args) {
		// java.util 패키지에 있는 Random 클래스 import 해서
		// 객체 생성 후 참조값을 ran 이라는 지역변수에 담는다.
		Random ran= new Random();
		
		// int 범위 내에서 랜덤한 정수 얻어내기
			//boundary 정하기 => nextInt(a) => 0 이상 ~ a 미만 사이의 숫자
		//int ranNum= ran.nextInt();
		
		// 0~9 범위 내에서 랜덤한 정수
		//int ranNum= ran.nextInt(10);
		
		// 1~45 범위 내에서의 랜덤한 정수
		int ranNum= ran.nextInt(45)+1;
		
		// 출력해 보기
		System.out.println(ranNum);
	}
}
