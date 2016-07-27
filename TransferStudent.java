
public class TransferStudent extends Student {
	private String formerSchool = "Unknown";
	
	//Constructors
	//public TransferStudent(){ //Default - no implementation
	//public TransferStudent(String fs){ // Bad idea in general*/
		//super("Sue", "Sophomore", 3.5);
		//formerSchool = fs;
	//}
	public TransferStudent(String n, String c, double gpa, String fs){
		super(n, c, gpa);
		formerSchool = fs;
	}
	//public void setFormerSchool(String fs){
	//	formerSchool = fs;
	//}
	public String getFormerSchool(){
		return formerSchool;
	}
	public void printStudent(){
		super.printStudent();
		System.out.print("\tFormer: "+ formerSchool);
	}
}


