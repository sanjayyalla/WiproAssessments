
public class Calculator {
	public static int powerInt(int num1,int num2)
	{
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
	public static void main(String[] args)
	{
		int intres = Calculator.powerInt(9, 2);
		System.out.println("9 to the power of 2 is "+intres);
		 double doubleResult = Calculator.powerDouble(2.5, 3);
		 System.out.println("2.5 to the power of 3 is: " + doubleResult);
	}
	
}
