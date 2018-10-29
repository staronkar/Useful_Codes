package experiment1;

public class abstractDemo {

	public static void main(String[] args) {
		human m = new man();
		m.eat();
		m.run();
	}

}

abstract class human
{
	public abstract   void eat();
	
	public void run() {
		System.out.println("run for human");
	}
	
}

class man extends human {

	
	public void eat() {
		System.out.println("For man");
		
	}
	/*public void run() {
		System.out.println("Run for man");
	}*/
	
}