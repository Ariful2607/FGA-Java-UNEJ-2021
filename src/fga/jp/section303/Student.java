package fga.jp.section303;

public class Student implements Comparable<Student> {
	private String firstName;
	private String lastName;
	private int mark;

	public Student(String firstName, String lastName, int mark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mark = mark;
	}//end constructor
	
	public String getFirstName() {
		return firstName;
	}//end method getFirstName
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//end method etFirstName
	
	public String getLastName() {
		return lastName;
	}//end method getLastName
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//end method setLastName
	
	public int getMark() {
		return mark;
	}//end method getMark
	
	public void setMark(int mark) {
		this.mark = mark;
	}//end method setMark
	
	
	@Override
	public int compareTo(Student stud2) {
	    if((Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark())) < 0 )) 
	    	return -1;
	    if((Integer.valueOf(mark).compareTo(Integer.valueOf(stud2.getMark())) == 0 ))  
	    	return 0;     
	    return 1;
	}//end method compareTo

	
    public String toString() {
    	return "Student Details: " + firstName 
    			+ " " + lastName + " " + mark;
    }//end method toString


}//end class Student

