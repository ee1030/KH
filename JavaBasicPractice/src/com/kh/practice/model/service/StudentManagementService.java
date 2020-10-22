package com.kh.practice.model.service;

import com.kh.practice.model.vo.Student;

public interface StudentManagementService {

	// ��ü �л� ������ ����ִ� �迭�� ��ȯ�ϴ� service
	public abstract Student[] selectAll();
	
	// students ��ü �迭���� �̸��� ��ġ�ϴ� �л� ��ü ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ (���������� ���ٰ� ����)
	public abstract Student selectName(String name);
	
	// students ��ü �迭���� ���޹��� gender�� ������ ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	public abstract Student[] selectGender(char gender);
	
	// students ��ü �迭���� ���޹��� age�� ���̰� ��ġ�ϴ� �л��� Student �迭�� ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ
	public abstract Student[] selectAge(int age);
	
	// ���޹��� Student ��ü�� Student[] �迭�� students�� �߰�
	// ���� students �迭�� ũ�Ⱑ ������ ��� 2��� ������Ų �� �߰�.
	public abstract void insertStudnet(Student std);
	
	// students �迭 ��� �� name �Ӽ� ���� ���޹��� name�� ��ġ �迭 ��Ҹ� ã��
	// �ش� ��Ұ� �����ϴ� Student ��ü�� ���޹��� std�� ���� ����
	public abstract void updateStudent(String name, Student std);
	
	// ���޹��� name�� ��ġ�ϴ� �̸��� ���� �л� ������ students �迭���� ���� ��
	// �迭 �߰��� ������� �ʵ��� ������ ������ ������ ��ܿ���.
	// �̸��� ��ġ�ϴ� �л��� ���� ��� ������ �л� ����(Student), ���� ��� null�� ��
	public abstract Student deleteStudent(String name);
}
