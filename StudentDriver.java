public class StudentDriver{
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Tina", "Freshman", 3.9);
		Student s3 = new Student("Tom", "Sophomore", 3.8);
		
		s2.printStudent();
		
		System.out.println( s3.getName() );
	}
}