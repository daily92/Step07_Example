package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		
		// Scanner ��ü �����ؼ� (System.in => Ű����� ����� ��ü)
		Scanner scan= new Scanner(System.in);
		
			//****println �ƴϰ� print ��!!
		System.out.print("�Է� : ");
		
		// ���ڿ� �Է� �ޱ�
			//�Է� �� ���� ������
			//=> �Է��� ���ڿ��� String type ���� scan.nextLine()�� ������
			//=> msg ������ ���, �������� return
		String msg= scan.nextLine();
		
		System.out.println("msg : " + msg);
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
