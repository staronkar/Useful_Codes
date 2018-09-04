package SuperCodes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class duplicateNumber {

	public static void main(String[] args) {
		List<Integer> abc = new LinkedList();
		abc.add(50);
		abc.add(39);
		abc.add(79);
		abc.add(67);
		abc.add(780);
		abc.add(79);
		abc.add(79);
		abc.add(67);
		
		System.out.println("The numbers are : "+abc);
		Collections.sort(abc,Collections.reverseOrder());
		System.out.println("The numbers after sorting are : "+abc);
		findDuplicatec(abc);
	}

	private static void findDuplicatec(List<Integer> abc) {
		for(int i=0;i<abc.size();i++) {
			for(int j=i+1;j<abc.size();j++) {
				if(abc.get(i).equals(abc.get(j))) {
					System.out.println("Duplicate found : "+abc.get(i));
					break;
				}
			}
		}
		
	}

}
