
public class Primitives {

	public static void main(String[] args) {
		// Integer primitive types
		byte b = 0; // 1 byte of storage
		short s = 0; // 2 bytes
		int i = 0; // 4 bytes *default*
		long l = 123456789120L; // 8 bytes (a long)
		
		//Floating Point types
		float f = 0.0F; // 4 bytes
		double d = 0.0; // 8 bytes *default*
		
		// floating points types
		
		boolean bool = true; // 1 bit
		
		char c = 'A'; // 2 bytes
		
		c = (char)(c + 5);
		
		System.out.println(c);
		
		int x = 0, y = 0;
		x = x + 1;
		y += 4;
		System.out.println(5.0/3);
		
		String str = "Hello";
		System.out.println(str);
		
		String str2 = new String ("Hello again");
		System.out.println(str2);
		
		if (str.equals(str2)){
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}

}
