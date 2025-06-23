package assignemnt_ExceptionHandling;

public class AIOOBE {
	public static void main(String[] args) {
		String s="Jayashree";
		try {
			System.out.println(s.charAt(100));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Index is out of the length of the array");
			System.out.println(e.getMessage());
		}

	}

}
