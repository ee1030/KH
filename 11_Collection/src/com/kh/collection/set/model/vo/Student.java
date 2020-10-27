package com.kh.collection.set.model.vo;

public class Student {

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
	
	
}
