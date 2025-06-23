package assignment_Packages.university.courses;

public class Courses {
	private String coursename;
	private String courseid;
	static int count;
	
	public Courses(String coursename,String courseid){
		this.coursename=coursename;
		this.courseid=courseid;
		count++;
	}
	
	public String getCourseName(){
		return coursename;
	}
	
	public String getCourseId(){
		return courseid;
	}
	
	public static int getCount(){
		return count;
	}
	
	public String toString(){
		return "CourseName: "+coursename+"\nCourseId: "+courseid;
	}
}