package experiment1;

import javax.naming.spi.DirStateFactory.Result;

class test2{
	int i ;
	int j,result;
	
	void perform() {
		result = i+j;
	}
}

public class test {

	public static void main(String[] args) {
		test2 t = new test2();
		t.i= 2;
		t.j= 7;
		t.perform();
		System.out.println("Value of result is = "+t.result);

	}

}
