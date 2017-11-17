package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		// Scanner 객체 생성해서 (System.in => 키보드와 연결된 객체)
		Scanner scan= new Scanner(System.in);
		
			//****println 아니고 print 임!!
		System.out.print("입력 : ");
		
		// 문자열 입력 받기
			//입력 후 엔터 누르면
			//=> 입력한 문자열을 String type 으로 scan.nextLine()에 가져옴
			//=> msg 변수에 담고, 그제서야 return
		String msg= scan.nextLine();
		
		System.out.println("msg : " + msg);
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
