package javaassignments;

public class RemoveJunkChar {

	public static void main(String[] args) {
		
		String wrd = "!@#$#$Selenium&%#$%@Automation";
		
		System.out.println(wrd.replaceAll("[^a-zA-Z0-9]", ""));

	}

}
