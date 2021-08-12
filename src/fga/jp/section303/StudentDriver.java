package fga.jp.section303;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList<Student> studentNames = new ArrayList();
		
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		displayStudents(studentNames);
	}//end method main

	static void displayStudents(ArrayList<Student> studentNames) {
		for(Student student: studentNames)
			System.out.println(student);
		//endfor
	}//end method displayStudents
	
	static void addStudents(ArrayList<Student> studentNames) {
		//Add the names of the following students
		studentNames.add(new Student("Mark", "Mywords", 95));
		studentNames.add(new Student("Andrew", "Apic", 45));
		studentNames.add(new Student("Beth", "Tween", 78));
	}//end method addStudents

}//end class StudentDriver
