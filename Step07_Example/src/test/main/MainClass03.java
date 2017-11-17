package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("가위 바위보 게임을 시작합니다.");
		
		Scanner scan= new Scanner(System.in);
			//** println 아니고 print 임!!!
		System.out.print("가위(0), 바위(1), 보(2) 입력 : ");
		
		// 정수 입력 받기
		int inputNum= scan.nextInt(3);
		
		Random ran= new Random();
		int ranNum= ran.nextInt(3);
		
		if(inputNum==0) {
			if(ranNum==2) {
				System.out.println("나:가위 > 컴터 : 보 => 이겼당!");
			}else if(ranNum==0) {
				System.out.println("나:가위 = 컴터 : 가위 => 비겼당!");
			}else if(ranNum==1) {
				System.out.println("나:가위 < 컴터 : 바위 => 졌당!");
			}
		}else if(inputNum==1) {
			if(ranNum==0) {
				System.out.println("나:바위 > 컴터 : 가위 => 이겼당!");
			}else if(ranNum==1) {
				System.out.println("나:바위 = 컴터 : 바위 => 비겼당!");
			}else if(ranNum==2) {
				System.out.println("나:바위 < 컴터 : 보 => 졌당!");
			}
		}else if(inputNum==2) {
			if(ranNum==1) {
				System.out.println("나:보 > 컴터 : 바위 => 이겼당!");
			}else if(ranNum==2) {
				System.out.println("나:보 = 컴터 : 보 => 비겼당!");
			}else if(ranNum==0) {
				System.out.println("나:보 < 컴터 : 가위 => 졌당!");
			}
		}
		
		System.out.println("가위 바위보 게임을 종료합니다.");
		//System.out.println(inputNum);
	}
}
