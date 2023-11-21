package javaassignments;

public class SplitTheWord {

	public static void main(String[] args) {
		
		String strr = "Happy_Learning_Java_Selenium";
		
		String value[] = strr.split("_");
		
		for(int i=0; i<value.length; i++) {
			
			System.out.println(value[i]);
		}
		
	}

}
