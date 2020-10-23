package com.kh.practice.model.service;

import java.util.Arrays;

import com.kh.practice.model.vo.Student;

public class StudentManagementServiceImpl implements StudentManagementService {
	private Student[] students = {
		new Student("������", 30, 'F'), 	new Student("������", 27, 'M'),	new Student("������", 27, 'F'),	new Student("����", 26, 'M'),
		new Student("�踸��", 29, 'M'),	new Student("�輺��", 28, 'F'),	new Student("�迵��", 28, 'M'),	new Student("������", 26, 'M'),
		new Student("����ȭ", 25, 'F'),	new Student("������", 26, 'F'),	new Student("���¿�", 28, 'M'),	new Student("������", 27, 'F'),
		new Student("�ΰ��", 26, 'M'),	new Student("�ڿ���", 28, 'F'),	new Student("����ȣ", 24, 'M'),	new Student("������", 28, 'F'),
		new Student("����", 32, 'M'),	new Student("������", 26, 'F'),	new Student("������", 27, 'M'),	new Student("������", 27, 'M'),
		new Student("�̼���", 31, 'F'),	new Student("������", 25, 'F'),	new Student("����ȣ", 29, 'M'),	new Student("������", 22, 'F'),
		new Student("���Ѽ�", 27, 'F'),	new Student("�ӼҸ�", 25, 'F'),	new Student("������", 25, 'F'),	new Student("������", 26, 'F'),
		new Student("�ּ���", 25, 'M')
	};
	
	// ���� students �迭�� ������ ���� ����� �ε������� �����ϴ� ����
	private int currentIndex = students.length -1;
	
	
	// ��ü �л� ������ ����ִ� �迭�� ��ȯ�ϴ� service
	@Override
	public Student[] selectAll() {
		return students; // Impl Ŭ�������� ����� ���� ��ü �迭�� �״�� ��ȯ
	}


	// students ��ü �迭���� �̸��� ��ġ�ϴ� �л� ��ü ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ (���������� ���ٰ� ����)
	@Override
	public Student selectName(String name) {
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				return students[i];
			}
		}
		return null;
	}


	// students ��ü �迭���� ���޹��� gender�� ������ ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	@Override
	public Student[] selectGender(char gender) {
		
		Student[] newObjectArr = new Student[students.length];
		
		int currentIndex = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getGender() == gender) {
				newObjectArr[currentIndex] = students[i];
				currentIndex++;
			}
		}
		
		return newObjectArr;
	}


	// students ��ü �迭���� ���޹��� age�� ���̰� ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ
	@Override
	public Student[] selectAge(int age) {
		
		Student[] newObjectArr = new Student[students.length];
		
		int currentIndex = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getAge() == age) {
				newObjectArr[currentIndex] = students[i];
				currentIndex++;
			}
		}
		
		return newObjectArr;
	}


	// ���޹��� Student ��ü�� Student[] �迭�� students�� �߰�
	// ���� students �迭�� ũ�Ⱑ ������ ��� 2��� ������Ų �� �߰�.
	@Override
	public void insertStudnet(Student std) {
		if(currentIndex == students.length - 1) {
			Student[] newArr = new Student[students.length * 2];
			
			System.arraycopy(students, 0, newArr, 0, students.length);
			
			students = newArr;
		}
		
		currentIndex++;
		students[currentIndex] = std;
	}
	
	
	
	// students �迭 ��� �� name �Ӽ� ���� ���޹��� name�� ��ġ �迭 ��Ҹ� ã��
	// �ش� ��Ұ� �����ϴ� Student ��ü�� ���޹��� std�� ���� ����
	@Override
	public void updateStudent(String name, Student std) {
		for(int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				students[i] = std;
			}
		}
	}
	


	// ���޹��� name�� ��ġ�ϴ� �̸��� ���� �л� ������ students �迭���� ���� ��
	// �迭 �߰��� ������� �ʵ��� ������ ������ ������ ��ܿ���.
	// �̸��� ��ġ�ϴ� �л��� ���� ��� ������ �л� ����(Student), ���� ��� null�� ��ȯ
	@Override
	public Student deleteStudent(String name) {
		
		Student tmpStd = new Student();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getName().equals(name)) {
				
				tmpStd = students[i];
				Student[] tmpArr = new Student[students.length];
				
//				System.arraycopy(students, 0, tmpArr, 0, i);
//				System.arraycopy(students, i+1, tmpArr, i, students.length - i - 1);
//							
//				students = tmpArr;
//				currentIndex--;
//				return tmpStd; // arraycopy�� �̿��Ͽ� �迭�� ���� �����ϴ� ���
				
				for(int j = i; j < students.length -1; j++) {
					students[j] = students[j+1];
				}
				students[currentIndex--] = null; // for���� �̿��Ͽ� i��° �ε������� ���� �ε����� ��ĭ�� ������ ��ܿ��� ���
				return tmpStd;
			}
		}
		return null;
	}
}
