package javaassignments;

public class PracticeMethd {
	
	//Two methods - static and non-static. Invoke these methods from a main method

	public static void CalSum(int a, int b) {

		int Sum = a + b;
		System.out.println("The sum of a and b is : " + Sum);
	}

	public int CalSub(int x, int y) {

		int Sub = x - y;
		return Sub;
	}

	public static void main(String[] args) {

		CalSum(3456, 6634); //static methods can be accessed without creating any objects
		CalSum(456, 98665);
		PracticeMethd cal = new PracticeMethd(); //for non-static methods you need to create an object of the class
		int Sub1 = cal.CalSub(890, 89);
		System.out.println("The subtraction of x and y is: "+ Sub1);

	}

}
