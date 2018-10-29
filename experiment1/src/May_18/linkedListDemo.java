package May_18;
import java.util.*;

public class linkedListDemo {

	public static void main(String[] args) {
		LlnkedList list = new LlnkedList();
		list.insert(5);
		list.insert(40);
		list.interAtStart(23);
		list.insert(34);
		list.insertAt(2, 10);
		list.interAtStart(21);
		
		list.show();
	}

}
