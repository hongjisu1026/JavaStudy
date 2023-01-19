class Test1
{
	public static void main(String[] args)
	{
		multiply(4, 6);
	}
	
	public static void multiply(int num1, int num2)
	{
		for(int i = num1; i<=num2; i++)
		{
			for(int j = 1; j<=9; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}	

class Test2
{
	public static void main(String[] args)
	{
		System.out.println(add(5, 10));
	}

	public static int add(int num1, int num2)
	{
		int sum = 0;
		for(int i = num1; i<=num2; i++)
		{
			sum += i;
		}

		return sum;
	}
}

class Test3
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}

	public static int factorial(int num)
	{
		int fac = 1;
		for(int i = 1; i<=num; i++)
		{
			fac *= i;
		}
		
		return fac;
	}
}

class Test4
{
	public static void main(String[] args)
	{
		System.out.println(primeNumber(5));
		System.out.println(primeNumber(6));
		System.out.println(primeNumber(-1));
	}

	public static boolean primeNumber(int num)
	{
		boolean flag = true;
	
		if(num>1)
		{	
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag = false;
					break;
				}
			}
		} else
		{
			flag = false;
		}

		return flag;
	}
}

class Test5
{
	public static void main(String[] args)
	{
		for(int j=1; j<=100; j++)
		{
			if(primeNumber(j) == true)
			System.out.print(j + "\t");
		}
	}

	public static boolean primeNumber(int num)
	{
		boolean flag = true;
	
		if(num>1)
		{	
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag = false;
					break;
				}
			}
		} else
		{
			flag = false;
		}

		return flag;
	}
}

class Test6
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}

	public static int factorial(int num)
	{
		if(num==1) return num;
		return num*factorial(num-1);
	}
}

class Test7
{
	public static void main(String[] args)
	{
		binary(7);
	}
	
	public static void binary(int num)
	{
		if(num<2)
		System.out.print(num);
		else
		{
			System.out.print(num%2);
			binary(num/2);
		}
	}
}

class Test8
{
	public static void main(String[] args)
	{
		System.out.println(fibo(4));
	}

	public static int fibo(int num)
	{
		if(num<=1)
		return num;
		else
		return fibo(num-2) + fibo(num-1);
	}
}

class CircleMain
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		c1.initCircle(5);
		c1.roundCircle();
		c1.areaCircle();
		c1.printCircle();

		c2.initCircle(10);
		c2.roundCircle();
		c2.areaCircle();
		c2.printCircle();

		c3.initCircle(30);
		c3.roundCircle();
		c3.areaCircle();
		c3.printCircle();
	}
}

class Circle
{
	double r, round, area;
	double pi = 3.14;

	public void initCircle(int r)
	{
		this.r = r;
	}

	public void roundCircle()
	{
		round = pi * 2 * r;
	}

	public void areaCircle()
	{
		area = pi * r * r;
	}

	public void printCircle()
	{
		System.out.println("반지름 : " + r);
		System.out.println("둘레 : " + round);
		System.out.println("면적 : " + area);
		System.out.println();
	}
}