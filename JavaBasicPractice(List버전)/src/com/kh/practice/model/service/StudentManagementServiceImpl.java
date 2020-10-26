package com.kh.practice.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kh.practice.model.vo.Student;

public class StudentManagementServiceImpl implements StudentManagementService {
	private Student[] stdArr = {
		new Student("강보령", 30, 'F'), new Student("강성혁", 27, 'M'),	new Student("강수정", 27, 'F'),	new Student("고보석", 26, 'M'),
		new Student("김만희", 29, 'M'),	new Student("김성령", 28, 'F'),	new Student("김영주", 28, 'M'),	new Student("김정민", 26, 'M'),
		new Student("김정화", 25, 'F'),	new Student("김정훈", 26, 'F'),	new Student("김태우", 28, 'M'),	new Student("김현혜", 27, 'F'),
		new Student("민경목", 26, 'M'),	new Student("박영현", 28, 'F'),	new Student("박지호", 24, 'M'),	new Student("박혜윤", 28, 'F'),
		new Student("박희도", 32, 'M'),	new Student("신주희", 26, 'F'),	new Student("유지권", 27, 'M'),	new Student("유현재", 27, 'M'),
		new Student("이솔이", 31, 'F'),	new Student("이정아", 25, 'F'),	new Student("이준호", 29, 'M'),	new Student("이진선", 22, 'F'),
		new Student("이한솔", 27, 'F'),	new Student("임소리", 25, 'F'),	new Student("정연정", 25, 'F'),	new Student("조유림", 26, 'F'),
		new Student("최순영", 25, 'M')
	};
	
	// 배열 -> List로 변환
	private List<Student> students = new ArrayList<Student>(Arrays.asList(stdArr));
	
	// 현재 students 배열의 마지막 값이 저장된 인덱스값을 저장하는 변수
	//private int currentIndex = students.size() -1;
	
	
	// 전체 학생 정보가 담겨있는 List를 반환하는 service
	@Override
	public List<Student> selectAll() {
		return students;
	}

	// students List에서 이름이 일치하는 학생 객체 반환하는 service
	// 일치하는 학생이 없으면 null 반환 (동명이인은 없다고 가정)
	@Override
	public Student selectName(String name) {
		Student std = null; // 검색결과 저장용 변수
		
		for(Student tmp : students) {
			if(tmp.getName().equals(name)) {
				std = tmp;
				break;
			}
		}
		return std;
	}


	// students List에서 전달받은 gender와 성별이 일치하는 학생을 List로 반환하는 service
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


	// students List에서 전달받은 age와 나이가 일치하는 학생을 List로 반환하는 service
	// 일치하는 학생이 없으면 null 반환
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


	// 전달받은 Student 객체를 List인 students에 추가
	@Override
	public void insertStudent(Student std) {
		students.add(std);
	}
	
	// List 요소 중 name 속성 값이 전달받은 name과 일치하는 요소를 찾아 수정
	@Override
	public void updateStudent(String name, Student std) {
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getName().equals(name)) {
				students.set(i, std);
			}
		}
	}
	
	


	// 전달받은 name과 일치하는 이름을 가진 학생 정보를 List에서 제거 후 제거한 학생 정보를 반환
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
