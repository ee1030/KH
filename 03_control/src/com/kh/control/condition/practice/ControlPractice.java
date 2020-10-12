package com.kh.control.condition.practice;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		String result = null;
		
		switch(input) {
		case 1 :
			result = "�Է�";
			break;
		case 2 :
			result = "����";
			break;
		case 3 :
			result = "��ȸ";
			break;
		case 4 :
			result = "����";
			break;
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�.");
			return;
		}
		
		System.out.println(result + " �޴� �Դϴ�.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Ѱ� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		sc.close();
		
		if(input > 0) {
			if(input % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		sc.close();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int input = sc.nextInt();
		
		sc.close();

		String result = null;
		switch(input) {
		case 1:
			result = "�ܿ�";
			break;
		case 2:
			result = "�ܿ�";
			break;
		case 3:
			result = "��";
			break;
		case 4:
			result = "��";
			break;
		case 5:
			result = "��";
			break;
		case 6:
			result = "����";
			break;
		case 7:
			result = "����";
			break;
		case 8:
			result = "����";
			break;
		case 9:
			result = "����";
			break;
		case 10:
			result = "����";
			break;
		case 11:
			result = "����";
			break;
		case 12:
			result = "�ܿ�";
			break;
		default :
			System.out.println(input + "�� �߸� �Էµ� ���Դϴ�.");
			return;
		}
		
		System.out.println(input + "�� " + result +"�Դϴ�.");
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "myId";
		String pwd = "myPwd";
		
		System.out.print("���̵� : ");
		String inputId = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String inputPwd = sc.nextLine();
		
		sc.close();
		
		if(inputId.equals(id)) {
			if(inputPwd.equals(pwd)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String grade = sc.nextLine();
		
		sc.close();
		
		switch(grade) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
			break;
			
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ");
			break;
			
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		sc.close();
		
		double BMI = weight / (height * height);
		
		if(BMI < 18.5) {
			System.out.println("BMI ���� : " + BMI + "\n��ü��");
		} else if(BMI < 23) {
			System.out.println("BMI ���� : " + BMI + "\n����ü��");
		} else if(BMI < 25) {
			System.out.println("BMI ���� : " + BMI + "\n��ü��");
		} else if(BMI < 30) {
			System.out.println("BMI ���� : " + BMI + "\n��");
		} else {
			System.out.println("BMI ���� : " + BMI + "\n����");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է� : ");
		char op = sc.nextLine().charAt(0);
		
		sc.close();
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int semiEx = sc.nextInt();
		
		System.out.print("�⸻ ��� ���� : ");
		int finalEx = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int practice = sc.nextInt();
		
		System.out.print("�⼮ ȸ�� : ");
		int  att = sc.nextInt();
		
		sc.close();
		
		double semiResult = semiEx*0.2;
		double finalResult = finalEx*0.3;
		double pracResult = practice*0.3;
		
		double result = semiResult + finalResult + pracResult + att;
		
		String pass = null;
		
		if(att > 14) {
			if(result >= 70) {
				pass = "Pass";
				System.out.println("============= ��� =============");
				System.out.println("�߰� ��� ����(20) : " + semiResult);
				System.out.println("�⸻ ��� ����(30) : " + finalResult);
				System.out.println("���� ����		(20) : " + pracResult);
				System.out.println("�⼮ ����		(20) : " + att);
				System.out.println("���� : " + result);
				System.out.println(pass);
			} else { 
				pass = "Fail [���� �̴�]";
				System.out.println("============= ��� =============");
				System.out.println("�߰� ��� ����(20) : " + semiResult);
				System.out.println("�⸻ ��� ����(30) : " + finalResult);
				System.out.println("���� ����		(20) : " + pracResult);
				System.out.println("�⼮ ����		(20) : " + att);
				System.out.println("���� : " + result);
				System.out.println(pass);
			}
		} else {
			pass = "Fail [�⼮ ȸ�� ���� ("+att+"/20)]";
			System.out.println(pass);
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int input = sc.nextInt();
		sc.nextLine();
		
		switch(input) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
		
		sc.close();
	}
}
