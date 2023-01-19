class MethodTest
{
	public static void main(String[] args)
	{
		int result;
		result = add(5, 10);
		System.out.println(result);
		result = subtract(5, 10);
		System.out.println(result);
	}

	public static int add(int num1, int num2)
	{
		int temp;
		temp = num1 + num2;
		return temp;
	}
	
	public static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}

	public static int hi(int max)
	{
		int i = 0;
		for(i=0;i<max;i++)
		{
			System.out.println("Hi");
		}
		return 100;
	}
}

class MethodTest1
{
	public static void main(String[] args)
	{
		int result;
		result = add(10, 2);
		System.out.println(result);
		result = subtract(10, 2);
		System.out.println(result);
		result = multiply(10, 2);
		System.out.println(result);
		result = divide(10, 2);
		System.out.println(result);
	}
	
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}

	public static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}

	public static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2)
	{
		return num1 / num2;
	}
}

class MethodTest2
{
	public static void main(String[] args)
	{
		multiply(3);
	}
	
	public static void multiply(int num) 
	{
		int m;
		for(int i = 2; i<=9; i++)
		{
			m = num * i;
			System.out.println(num + " * " + i + " = " + m);
		}
	}
}

class MethodTest3
{
	public static void main(String[] args)
	{
		multiply(3,5);
	}
	
	public static void multiply(int num1, int num2) 
	{
		int m;
		for(int i = num1; i<=num2; i++)
		{
			for(int j=2; j<=9; j++)
			{
				m = i * j;
				System.out.println(i + " * " + j + " = " + m);
			}
			System.out.println();
		}
	}
}

class MethodTest4
{
	public static void main(String[] args)
	{
		int result;
		result = add(10);
		System.out.println(result);
	}

	public static int add(int num)
	{
		int sum;
		for(int i = 1; i<=num; i++)
		{
			sum += i;
		}
		
		return sum;
	}
}



	