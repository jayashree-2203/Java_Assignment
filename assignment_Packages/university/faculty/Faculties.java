package assignment_Packages.university.faculty;

public class Faculties 
{
	private String specialisation;
	private int experience;
	
	public Faculties(String specialisation,int experience){
		this.specialisation=specialisation;
		this.experience=experience;
	}
	
	public String getSpecilisation(){
		return specialisation;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public String toString(){
		return "Specialisation: "+specialisation + "\nExperience: "+experience+"years";
	}
}