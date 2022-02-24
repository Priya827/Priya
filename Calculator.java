package week1.day1;

public class Calculator {
	int num1,num2,num3,sum,subtract,multiply;
	float divide;
	public int add()
	{
	num1 = 2;
	num2 = 4;
	num3 = 10;
		sum = num1 + num2 + num3;
		return sum;
	}
	public int sub()
	{
		num1 = 2;
		num2 = 4;
		num3 = 10;
	    subtract = num1 - num2;
	    return subtract;
	}
	public int mul()
	{
		num1 = 2;
		num2 = 4;
		num3 = 10;
		multiply = num1 * num2;
		return multiply;
	}
	public float div()
	{
		num1 = 10;
		num2 = 100;
		divide = num1 / num2;
		return divide;
	}
	
}



