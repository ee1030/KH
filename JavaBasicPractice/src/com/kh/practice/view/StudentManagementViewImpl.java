package com.kh.practice.view;

import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementService;
import com.kh.practice.model.service.StudentManagementServiceImpl;

public class StudentManagementViewImpl extends StudentManagementView {
	
	private Scanner sc = new Scanner(System.in);
	private StudentManagementService service = new StudentManagementServiceImpl();
	
	// ��ü �л� ��ȸ view
	@Override
	public void selectAll() {
		// service.selectAll() �޼ҵ带 ȣ���Ͽ�
		// ��ü �л� ������ Student[]�� ��ȯ �޾� ȭ�鿡 ��� 
		// ��, �迭 ����� �������� null�̸� ��� �ݺ��� ���� 
		
		for(int i = 0; i < service.selectAll().length; i++) {
			if(service.selectAll()[i] == null) {
				break;
			}
			System.out.println(service.selectAll()[i].toString());
		}
	}
	
	// �̸� �˻� view
	@Override
	public void selectName() {
		// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// �̸��� �Է¹޾�  service.selectName(�Է¹����̸�)�� ȣ���ϰ�
		// ����� Student Ÿ������ ����.
		// ����� null�� �ƴҰ�� �˻� ��� ���,
		// ����� null�� ��� "��ġ�ϴ� �л��� �����ϴ�." ���
		System.out.print("�˻� �Ͻ� �̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(service.selectName(name).getName() == null) {
			System.out.println("��ġ �ϴ� �л��� �����ϴ�.");
		} else {
			System.out.println(service.selectName(name).toString());
		}	
	}
	
	
	// ���� �˻� view
	@Override
	public void selectGender() {
		// �̸��� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// �̸��� �Է¹޾�  service.selectGender(�Է¹�������)�� ȣ���ϰ�
		// ����� Student[] Ÿ������ �޾� for���� �̿��Ͽ� ���.
		// ������ �߸� �Է��� ��� "�߸� �Է��ϼ̽��ϴ�. (M �Ǵ� F�� �Է����ּ���.)" ���
		System.out.print("�˻��Ͻ� ������ �Է��� �ּ��� : ");
		char input = sc.nextLine().charAt(0);
		
		if(input == 'M' || input == 'F') {
			
			for(int i = 0; i < service.selectGender(input).length; i++) {
				if(service.selectGender(input)[i] == null) {
					break;
				}
				System.out.println(service.selectGender(input)[i].toString());
			}
			
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. (M �Ǵ� F�� �Է����ּ���.)");
		}
	}
	
	
	// ���� �˻� view
	@Override
	public void selectAge() {
		// ���̰� ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// ���̸� �Է¹޾�  service.selectAge(�Է¹�������)�� ȣ���ϰ�
		// ����� Student[] Ÿ������ �޾� for���� �̿��Ͽ� ���.
		// ��, ���޹���  Student[]�� ���̰� 0�� ���
		// "���̰� ��ġ�ϴ� �л��� �����ϴ�." ���
		
		
	}
	
	
	// �л� ���� �߰� view
	@Override
	public void insertStudent() {
		// �̸�, ����, ������ �Է¹޾� Student ��ü�� �����ϰ�,
		// service.insertStundet(������ Student��ü)�� ȣ���Ͽ� ����.
		// (��ȯ�� ����)
	}
	
	
	// �л� ���� ���� view
	@Override
	public void updateStudent() {
		// ������ �л��� �̸��� �Է¹ް� �̸��� ��ġ�ϴ� �л��� ������ �Ǵ����� 
		// service.selectName(�˻��� �̸�)�� ȣ���Ͽ� Student Ÿ���� ��ȯ ����.
		// ��ġ�ϴ� �л��� ���� ��� "��ġ�ϴ� �л��̾����ϴ�." ��� �� �޼ҵ� ����.
		
		// ��ġ�ϴ� �л��� ������ ��� �̸�, ���� ,������ �Է¹޾� Student ��ü�� �����ϰ�
		// service.updateStudent(�˻��� �̸�, ������ �л���ü)�Ͽ� �л� ������ ����.
		// (��ȯ�� ����)

		
	}
	
	
	
	
	// �л� ���� ���� view
	@Override
	public void deleteStudent() {
		// ������ �л��� �̸��� �Է� �޾�
		// service.deleteStudent(�Է¹����л��̸�)�� ȣ���ϰ�
		// Student Ÿ���� ��ȯ �޾�
		// ���� ���� �� ������ �л� ���� + " �����Ǿ����ϴ�.,
		// ���� ���� �� "��ġ�ϴ� �л��� �����ϴ�." ���
		
	}
	
	
	
	
}
