
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int[] ages = new int[x];
		
		ages[0] = 18;
		ages[1] = 21;
		ages[2] = 25;
		ages[3] = 40;
		ages[4] = 65;
		
		// second method:  int[] ages2 = {18, 21, 25, 40, 65};

		for (int i = 0; i < ages.length; i++ ){
			System.out.print(ages[i] +"  ");
		}
	}	
}
