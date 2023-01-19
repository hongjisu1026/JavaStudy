class Swap
{
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 5;
		System.out.println(num1 + " " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1 + " " + num2);
	}
}

