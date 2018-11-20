package parametersOperators;

public class ParametersOperators {
	public static void main(String[] args)
	{
		int a = 40;
		int b = 40;
		
		
		System.out.println("The sum is = " + multiply(40, 40, false));
		
		
		
	}
	
	public static int multiply(int a, int b, boolean isMultiply) {
		if (isMultiply) {
			return a * b;
		
		}
		
		return a + b;
		 		
	}
}




