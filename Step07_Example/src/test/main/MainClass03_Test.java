package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03_Test {
	public static void main(String[] args) {
		System.out.println("���� ������ ������ �����մϴ�.");
		
		Scanner scan= new Scanner(System.in);
			//** println �ƴϰ� print ��!!!
		System.out.print("����(0), ����(1), ��(2) �Է� : ");
		
		// ���� �Է� �ޱ�
		int inputNum= scan.nextInt(3);
		
		Random ran= new Random();
		int ranNum= ran.nextInt(3);
		
		String ranNum2= null;
		if(ranNum==0) {
			ranNum2= "����";
		}else if(ranNum==1) {
			ranNum2= "����";
		}else if(ranNum==2) {
			ranNum2= "��";
		}
		
		System.out.println("��ǻ�ʹ� " + ranNum2 + "�� �½��ϴ�.");
		if(inputNum==ranNum) {
			System.out.println("���׿�!");
		}else if((inputNum==0 && ranNum==2) 
			|| (inputNum==1 && ranNum==0)
			|| (inputNum==2 && ranNum==1)){
			System.out.println("�̰�׿�!");
		}else {
			System.out.println("���׿�!");
		}
		
		System.out.println("���� ������ ������ �����մϴ�.");
		//System.out.println(inputNum);
	}
}
