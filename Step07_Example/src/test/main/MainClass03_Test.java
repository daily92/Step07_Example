package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03_Test {
	public static void main(String[] args) {
		System.out.println("가위 바위보 게임을 시작합니다.");
		
		Scanner scan= new Scanner(System.in);
			//** println 아니고 print 임!!!
		System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
		
		// 정수 입력 받기
		int inputNum= scan.nextInt(3);
		
		Random ran= new Random();
		int ranNum= ran.nextInt(3);
		
		String ranNum2= null;
		if(ranNum==0) {
			ranNum2= "가위";
		}else if(ranNum==1) {
			ranNum2= "바위";
		}else if(ranNum==2) {
			ranNum2= "보";
		}
		
		System.out.println("컴퓨터는 " + ranNum2 + "를 냈습니다.");
		if(inputNum==ranNum) {
			System.out.println("비겼네요!");
		}else if((inputNum==0 && ranNum==2) 
			|| (inputNum==1 && ranNum==0)
			|| (inputNum==2 && ranNum==1)){
			System.out.println("이겼네요!");
		}else {
			System.out.println("졌네요!");
		}
		
		System.out.println("가위 바위보 게임을 종료합니다.");
		//System.out.println(inputNum);
	}
}
