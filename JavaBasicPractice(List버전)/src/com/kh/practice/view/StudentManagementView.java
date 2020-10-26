package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementServiceImpl;

public abstract class StudentManagementView {
	private Scanner sc = new Scanner(System.in);
	
	public void	displayMainMenu() {
		int sel = 0;
		
		do {
			System.out.println();
			System.out.println(""
					+ " = �л� ���� ���� ���α׷� =\n"
					+ "|   1. ��ü �л� ��ȸ      |\n"
					+ "|   2. Ư�� ���� �˻�      |\n"
					+ "|   3. �л� ���� �߰�      |\n"
					+ "|   4. �л� ���� ����      |\n"
					+ "|   5. �л� ���� ����      |\n"
					+ "|   0. ���α׷� ����       |\n"
					+ " ------------------"
					);
			
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			switch(sel) {
			case 1 : selectAll(); break;
			case 2 : subMenu(); break;
			case 3 : insertStudent(); break;
			case 4 : updateStudent(); break;
			case 5 : deleteStudent(); break;
			case 0 : System.out.println("���α׷��� �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}while(sel != 0);
	}
	
	
	// Ư�� ���� �˻� ����޴� View
	public void subMenu() {
		int sel = 0;
		boolean flag = false;
		
		do {
			flag = false;
			System.out.println("========== Ư�� ���� �˻� ==========");
			System.out.println("1. �̸����� �˻�");
			System.out.println("2. ���� �˻�");
			System.out.println("3. ���� �˻�");
			System.out.println("0. ���� �޴��� ���ư���");
			System.out.print("���� ���� : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			switch(sel) {
			case 1 : selectName(); break;
			case 2 : selectGender(); break;
			case 3 : selectAge(); break;
			case 0 : System.out.println("���� �޴��� ���ư��ϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				flag = true;
			}
			
		}while(sel != 0 && flag);
	}
	
	

	// ��ü �л� ��ȸ view
	// service.selectAll() �޼ҵ带 ȣ���Ͽ�
	// ��ü �л� ������ Student[]�� ��ȯ �޾� ȭ�鿡 ��� 
	public abstract void selectAll();
	
	
	
	// �̸� �˻� view
	// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
	// �̸��� �Է¹޾�  service.selectName(�Է¹����̸�)�� ȣ���ϰ�
	// ����� List Ÿ������ ����.
	// ����� null�� �ƴҰ�� �˻� ��� ���,
	// ����� null�� ��� "��ġ�ϴ� �л��� �����ϴ�." ���
	public abstract void selectName();
	
	
	// ���� �˻� view
	// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
	// �̸��� �Է¹޾�  service.selectGender(�Է¹�������)�� ȣ���ϰ�
	// ����� List Ÿ������ �޾� for���� �̿��Ͽ� ���.
	public abstract void selectGender();
	
	// ���� �˻� view
	// ���̰� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
	// ���̸� �Է¹޾�  service.selectAge(�Է¹�������)�� ȣ���ϰ�
	// ����� List Ÿ������ �޾� for���� �̿��Ͽ� ���.
	// ��, ���޹���  List�� ���̰� 0�� ���
	// "���̰� ��ġ�ϴ� �л��� �����ϴ�." ���
	public abstract void selectAge();
	
	
	// �л� ���� �߰� view
	// �̸�, ����, ������ �Է¹޾� Student ��ü�� �����ϰ�,
	// service.insertStundet(������ Student��ü)�� ȣ���Ͽ� ����.
	// (��ȯ�� ����)
	public abstract void insertStudent();
	
	
	// �л� ���� ���� view
	// ������ �л��� �̸��� �Է¹ް� �̸��� ��ġ�ϴ� �л��� ������ �Ǵ����� 
	// service.selectName(�˻��� �̸�)�� ȣ���Ͽ� Student Ÿ���� ��ȯ ����.
	// ��ġ�ϴ� �л��� ���� ��� "��ġ�ϴ� �л��̾����ϴ�." ��� �� �޼ҵ� ����.
	
	// ��ġ�ϴ� �л��� ������ ��� �̸�, ���� ,������ �Է¹޾� Student ��ü�� �����ϰ�
	// service.updateStudent(�˻��� �̸�, ������ �л���ü)�Ͽ� �л� ������ ����.
	// (��ȯ�� ����)
	public abstract void updateStudent();
	
	
	// �л� ���� ���� view
	// ������ �л��� �̸��� �Է� �޾�
	// service.deleteStudent(�Է¹����л��̸�)�� ȣ���ϰ�
	// Student Ÿ���� ��ȯ �޾�
	// ���� ���� �� ������ �л� ���� + " �����Ǿ����ϴ�.,
	// ���� ���� �� "��ġ�ϴ� �л��� �����ϴ�." ���
	public abstract void deleteStudent();
	
	
	
}
