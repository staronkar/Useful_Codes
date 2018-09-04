package SuperCodes;

import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

	public static void main(String[] args) {
		List<Integer> abc = new LinkedList<Integer>();
		abc.add(10);
		abc.add(20);
		abc.add(30);
		abc.add(40);
		abc.add(50);
		System.out.println("Original List :"+abc);
		reverse(abc);

	}

	private static void reverse(List<Integer> abc) {
		List<Integer> temp = new LinkedList<Integer>();
		System.out.println("Lenght of Original List is : "+abc.size());
		for(int i=abc.size()-1;i>=0;i--) {
			temp.add(abc.get(i));
		}
		
		System.out.println("Reverse List is : "+temp);
	}

}
