public class StudentDriver{
	
	public static void main(String[] args) {
		//Student s1 = new Student();
		//Student s2 = new Student("Tina", "Freshman", 3.9);
		//Student s3 = new Student("Tom", "Sophomore", 3.8);
		Student[] ourClass = {
				new Student (),
				new Student ("Tina", "Freshman", 3.9),
				new Student("Tom", "Sophomore", 3.8),
		};
		
		//s2.printStudent();
		ourClass[0].printStudent();
		ourClass[2].printStudent();
		
		//System.out.println( s3.getName() );
		//for (int i = 0; i < Student.ages.length; i++){
			//System.out.print(ages[i] +" ");
		}
}