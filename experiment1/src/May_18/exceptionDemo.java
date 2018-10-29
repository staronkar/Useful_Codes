package May_18;

public class exceptionDemo {
	public static void main(String[] args) {
		try {
			int i=5;
			System.out.println("Before");
			int j= i/2;
			System.out.println("After Division");
		} catch (Exception e) {
			System.out.println("Error is "+e);
			//e.printStackTrace();
		}
		System.out.println("Bye");
	}
}
