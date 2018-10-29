package Sept_18;

public class StringandStringBuffer {

	public static void main(String[] args) {
		String temp= new String("Sandhu");
		temp.concat(" Anand");

		System.out.println(temp);

		String name = "Onkar";
		name.concat(" Anand");
		System.out.println(name);
		System.out.println("Sandhya".concat(" anand"));
		
		StringBuffer sb=new StringBuffer("OK");
		sb.append("San");
		System.out.println(sb);
		
	}

}
