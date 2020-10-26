package com.kh.practice.model.service;

import java.util.List;

import com.kh.practice.model.vo.Student;

public interface StudentManagementService {

	// ��ü �л� ������ ����ִ� List�� ��ȯ�ϴ� service
	public abstract List<Student> selectAll();
	
	// students List���� �̸��� ��ġ�ϴ� �л� ��ü ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ (���������� ���ٰ� ����)
	public abstract Student selectName(String name);
	
	// students List���� ���޹��� gender�� ������ ��ġ�ϴ� �л��� List�� ��ȯ�ϴ� service
	public abstract List<Student> selectGender(char gender);
	
	// studentsList���� ���޹��� age�� ���̰� ��ġ�ϴ� �л��� List�� ��ȯ�ϴ� service
	// ��ġ�ϴ� �л��� ������ null ��ȯ
	public abstract List<Student> selectAge(int age);
	
	// ���޹��� Student ��ü�� List�� students�� �߰�
	public abstract void insertStudent(Student std);
	
	// List ��� �� name �Ӽ� ���� ���޹��� name�� ��ġ�ϴ� ��Ҹ� ã�� ����
	public abstract void updateStudent(String name, Student std);
	
	// ���޹��� name�� ��ġ�ϴ� �̸��� ���� �л� ������ List���� ���� �� ������ �л� ������ ��ȯ
	public abstract Student deleteStudent(String name);
}
