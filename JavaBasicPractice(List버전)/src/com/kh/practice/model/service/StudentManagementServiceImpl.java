package com.kh.practice.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.practice.model.vo.Student;

public class StudentManagementServiceImpl implements StudentManagementService {
	private Student[] stdArr = {
		new Student("������", 30, 'F'), new Student("������", 27, 'M'),	new Student("������", 27, 'F'),	new Student("����", 26, 'M'),
		new Student("�踸��", 29, 'M'),	new Student("�輺��", 28, 'F'),	new Student("�迵��", 28, 'M'),	new Student("������", 26, 'M'),
		new Student("����ȭ", 25, 'F'),	new Student("������", 26, 'F'),	new Student("���¿�", 28, 'M'),	new Student("������", 27, 'F'),
		new Student("�ΰ��", 26, 'M'),	new Student("�ڿ���", 28, 'F'),	new Student("����ȣ", 24, 'M'),	new Student("������", 28, 'F'),
		new Student("����", 32, 'M'),	new Student("������", 26, 'F'),	new Student("������", 27, 'M'),	new Student("������", 27, 'M'),
		new Student("�̼���", 31, 'F'),	new Student("������", 25, 'F'),	new Student("����ȣ", 29, 'M'),	new Student("������", 22, 'F'),
		new Student("���Ѽ�", 27, 'F'),	new Student("�ӼҸ�", 25, 'F'),	new Student("������", 25, 'F'),	new Student("������", 26, 'F'),
		new Student("�ּ���", 25, 'M')
	};
	
	// �迭 -> List�� ��ȯ
	private List<Student> students = new ArrayList<Student>(Arrays.asList(stdArr));
	
	// ���� students �迭�� ������ ���� ����� �ε������� �����ϴ� ����
	//private int currentIndex = students.size() -1;
	
	
	// ��ü �л� ������ ����ִ� List�� ��ȯ�ϴ� service
	@Override
	public List<Student> selectAll() {
		return students;
	}

	// students List���� �̸��� ��ġ�ϴ� �л� ��ü ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ (���������� ���ٰ� ����)
	@Override
	public Student selectName(String name) {
		Student std = null; // �˻���� ����� ����
		
		for(Student tmp : students) {
			if(tmp.getName().equals(name)) {
				std = tmp;
				break;
			}
		}
		return std;
	}


	// students List���� ���޹��� gender�� ������ ��ġ�ϴ� �л��� List�� ��ȯ�ϴ� service
	@Override
	public List<Student> selectGender(char gender) {
		List<Student> std = new ArrayList<Student>();
		
		for(Student tmp : students) {
			if(tmp.getGender() == gender) {
				std.add(tmp);
			}
		}
		return std;
	}


	// students List���� ���޹��� age�� ���̰� ��ġ�ϴ� �л��� List�� ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ
	@Override
	public List<Student> selectAge(int age) {
		
		List<Student> std = new ArrayList<Student>();
		
		for(Student tmp : students) {
			if(tmp.getAge() == age) {
				std.add(tmp);
			}
		}
		return std;
	}


	// ���޹��� Student ��ü�� List�� students�� �߰�
	@Override
	public void insertStudent(Student std) {
		students.add(std);
	}
	
	// List ��� �� name �Ӽ� ���� ���޹��� name�� ��ġ�ϴ� ��Ҹ� ã�� ����
	@Override
	public void updateStudent(String name, Student std) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)) {
				students.set(i, std);
			}
		}
	}
	
	


	// ���޹��� name�� ��ġ�ϴ� �̸��� ���� �л� ������ List���� ���� �� ������ �л� ������ ��ȯ
	@Override
	public Student deleteStudent(String name) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)) {
				return students.remove(i);
			}
		}
		return null;
	}
}
