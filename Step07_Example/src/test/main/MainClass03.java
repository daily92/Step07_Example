package test.main;

import java.util.Random;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("���� ������ ������ �����մϴ�.");
		
		Scanner scan= new Scanner(System.in);
			//** println �ƴϰ� print ��!!!
		System.out.print("����(0), ����(1), ��(2) �Է� : ");
		
		// ���� �Է� �ޱ�
		int inputNum= scan.nextInt(3);
		
		Random ran= new Random();
		int ranNum= ran.nextInt(3);
		
		if(inputNum==0) {
			if(ranNum==2) {
				System.out.println("��:���� > ���� : �� => �̰��!");
			}else if(ranNum==0) {
				System.out.println("��:���� = ���� : ���� => ����!");
			}else if(ranNum==1) {
				System.out.println("��:���� < ���� : ���� => ����!");
			}
		}else if(inputNum==1) {
			if(ranNum==0) {
				System.out.println("��:���� > ���� : ���� => �̰��!");
			}else if(ranNum==1) {
				System.out.println("��:���� = ���� : ���� => ����!");
			}else if(ranNum==2) {
				System.out.println("��:���� < ���� : �� => ����!");
			}
		}else if(inputNum==2) {
			if(ranNum==1) {
				System.out.println("��:�� > ���� : ���� => �̰��!");
			}else if(ranNum==2) {
				System.out.println("��:�� = ���� : �� => ����!");
			}else if(ranNum==0) {
				System.out.println("��:�� < ���� : ���� => ����!");
			}
		}
		
		System.out.println("���� ������ ������ �����մϴ�.");
		//System.out.println(inputNum);
	}
}
