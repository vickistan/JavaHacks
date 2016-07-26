/**
 * 
 **
 * @author vstanfield
 *
 */
public class Student {
	//fields (instance variables)
	private String name;
	private String classYear;
	private double gpa = 0.0;

	
	//constructors (methods to make new objects)
	public Student(){
		name = "No Name Given";
		classYear = "Unknown";
	}
	
	public Student(String n, String c, double g){
		name = n;
		classYear = c;
		setGPA(g);
	}
	
	//methods
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setGPA(double g){
		gpa = g;
		if (gpa < 0){
			gpa = 0;
			System.out.println("Name: "+ name+
								"\tGPA: "+ gpa+
								"\tclassYear: " + classYear);
		}
		
	}
	
	public void printStudent (){
		System.out.println("Name: "+ name+
				"\tGPA: "+ gpa+
				"\tclassYear: " + classYear);
	}
}

