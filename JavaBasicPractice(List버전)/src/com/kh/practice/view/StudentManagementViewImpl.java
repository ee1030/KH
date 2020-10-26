package com.kh.practice.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.model.service.StudentManagementService;
import com.kh.practice.model.service.StudentManagementServiceImpl;
import com.kh.practice.model.vo.Student;

public class StudentManagementViewImpl extends StudentManagementView {
	
	private Scanner sc = new Scanner(System.in);
	private StudentManagementService service = new StudentManagementServiceImpl();

	// ��ü �л� ��ȸ view
	@Override
	public void selectAll() {
		// service.selectAll() �޼ҵ带 ȣ���Ͽ�
		// ��ü �л� ������ List�� ��ȯ �޾� ȭ�鿡 ��� 
		
		List<Student> stdList = service.selectAll();
		System.out.println("========== ��ü �л� ��ȸ ==========");
		for(Student std : stdList) {
			System.out.println(std);
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
		
		System.out.print("[�̸� �˻�]�˻��� �л� �̸� �Է� : ");
		String name = sc.nextLine();
		
		Student std = service.selectName(name);
		if(std == null) {
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		} else {
			System.out.println(std);
		}
		
	}
	
	
	// ���� �˻� view
	@Override
	public void selectGender() {
		// ������ ��ġ�ϴ� �л��� �ִ��� �˻��ϱ� ����
		// ������ �Է¹޾�  service.selectGender(�Է¹�������)�� ȣ���ϰ�
		// ����� List Ÿ������ �޾� for���� �̿��Ͽ� ���.
		
		
		System.out.print("[���� �˻�]�˻��� ���� �Է�(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		List<Student> std = service.selectGender(gender);
		
		if(gender == 'M' || gender == 'F') {
			System.out.println("[���� �˻� ���]");
			for(Student tmp : std) {
				System.out.println(tmp);
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
		// ����� List Ÿ������ �޾� for���� �̿��Ͽ� ���.
		// ��, ���޹���  List�� ���̰� 0�� ���
		// "���̰� ��ġ�ϴ� �л��� �����ϴ�." ���
		
		System.out.print("[���� �˻�]�˻��� ���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		List<Student> std = service.selectAge(age);
		
		if(std.isEmpty()) {
			System.out.println("���̰� ��ġ�ϴ� �л��� �����ϴ�.");
		} else {
			for(Student tmp : std) {
				System.out.println(tmp);
			}
		}
		
	}
	
	
	// �л� ���� �߰� view
	@Override
	public void insertStudent() {
		// �̸�, ����, ������ �Է¹޾� Student ��ü�� �����ϰ�,
		// service.insertStundet(������ Student��ü)�� ȣ���Ͽ� ����.
		// (��ȯ�� ����)
		System.out.println("[�л� ���� �߰�]");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� : ");
		char gender = sc.nextLine().charAt(0);

		service.insertStudent(new Student(name, age, gender));
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

		System.out.print("[���� �л� �̸� �˻�] �Է� : ");
		String name = sc.nextLine();
		
		Student std = service.selectName(name);
		
		if(std == null) {
			System.out.println("��ġ�ϴ� �л��̾����ϴ�.");
		}else {
			System.out.println("[�л� ���� ����]");
			System.out.print("�̸� �Է� : ");
			String updateName = sc.nextLine();
			
			System.out.print("���� �Է� : ");
			int age = sc.nextInt();
			sc.nextLine();
			
			System.out.print("���� �Է� : ");
			char gender = sc.nextLine().charAt(0);
			
			service.updateStudent(name, new Student(updateName, age, gender));
		}
		
		
	}
	
	
	
	// �л� ���� ���� view
	@Override
	public void deleteStudent() {
		// ������ �л��� �̸��� �Է� �޾�
		// service.deleteStudent(�Է¹����л��̸�)�� ȣ���ϰ�
		// Student Ÿ���� ��ȯ �޾�
		// ���� ���� �� ������ �л� ���� + " �����Ǿ����ϴ�.,
		// ���� ���� �� "��ġ�ϴ� �л��� �����ϴ�." ���
		
		System.out.print("[�л� ���� ����]������ �л� �̸� : ");
		String name = sc.nextLine();
		
		Student std = service.deleteStudent(name);
		if(std == null) {
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
		} else {
			System.out.println(std + " �����Ǿ����ϴ�.");
		}
		
		
	}
	
	
	
	
}
