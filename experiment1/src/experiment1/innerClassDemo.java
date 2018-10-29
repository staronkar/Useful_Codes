package experiment1;

public class innerClassDemo {

	public static void main(String[] args) {
		abc a = new abc() {
			public void show() {
				System.out.println("In inner classdemo");
			}
			public void show1() {
				System.out.println("In second method");
			}
		};
		a.show();

	}
 
}

class abc
{
	public void show()
	{
		System.out.println("In class abc");
	}
}