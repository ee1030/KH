package com.kh.collection.set.model.vo;

public class Student implements Comparable<Student>{
					// Comparable : 객체의 기본 정렬 기준을 구현하는데 사용하는 인터페이스
					// -> compareTo() 메소드 오버라이딩
	private String name;
	private int age;
	private int javaScore;
	
	public Student() {}

	public Student(String name, int age, int javaScore) {
		this.name = name;
		this.age = age;
		this.javaScore = javaScore;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", javaScore=" + javaScore + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + javaScore;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (javaScore != other.javaScore)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// 기본 정렬 기준
		// 이름 오름차순으로 정렬
		
		// 반환값이 음수, 0일 경우 순서 유지, 양수일 때 바꿈 
		return this.name.compareTo(o.name);
	}
	
	
}
