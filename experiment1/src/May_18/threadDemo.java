package May_18;

class hi implements  Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi There");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}	
	}
}

class hello implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello There");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}

public class threadDemo {

	public static void main(String[] args) throws InterruptedException {
		hi obj1 = new hi();
		hello obj2 = new hello();
		Thread t1= new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

	}

}
