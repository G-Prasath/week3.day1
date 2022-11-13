package org.student;

import org.Department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name : Guru");
	}
	public void studentDept() {
		System.out.println("Student Dept : C/S");
	}
	public void studentId() {
		System.out.println("Student ID : 10021");
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.deptName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeCode();
		
	}
}
