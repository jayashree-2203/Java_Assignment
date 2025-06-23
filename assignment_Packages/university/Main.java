package assignment_Packages.university;

import assignment_Packages.university.courses.Courses;
import assignment_Packages.university.faculty.Faculties;
import assignment_Packages.university.student.Student;

public class Main {
	public static void main(String[] args) {
		Student stud=new Student("Ramesh","34677","Computer Science");
		Faculties fac=new Faculties("IT",5);
		Courses cour=new Courses("Development","501");
		Courses cour2=new Courses("Ai","502");
		System.out.println(stud.toString());
		System.out.println(Courses.getCount());		
	}
}