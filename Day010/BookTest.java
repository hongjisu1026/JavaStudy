class BookTest1
{
	public static void main(String[] args)
	{
		int num = 120;
		if(num>0 && num%2==0)
		System.out.println("양수이면서 짝수");
	}
}

class BookTest2
{
	public static void main(String[] args)
	{
		int num1 = 50;
		int num2 = 100;

		if(num1>num2)
		System.out.println("큰 수 : " + num1);
		else
		System.out.println("큰 수 : " + num2);

		if(num1>num2)
		System.out.println(num1 - num2);
		else
		System.out.println(num2 - num1);
	}
}

class BookTest3
{
	public static void main(String[] args)
	{
		int n = 3;
		if(n==1)
		System.out.println("Simple Java");
		else if(n==2)
		System.out.println("Funny Java");
		else if(n==3)
		System.out.println("Fantastic Java");	
		else System.out.println("The best programming language");
		
		System.out.println("Do you like Java?");
	}
}

class BookTest4
{
	public static void main(String[] args)
	{
		int n = 24;
		switch(n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30이상의 수");
		}
	}
}	

class BookTest5
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
	
		while(i<99)
		{
			i++;
			sum += i;
		}
		
		System.out.println(sum);
	}
}

class BookTest6
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
	
		while(i<100)
		{
			i++;
			System.out.println(i);
		}
		
		System.out.println();
		do
		{
			System.out.println(i);
			i--;
			
		} while(i>0);
	}
}

class BookTest7
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
	
		while(i<1000)
		{
			i++;
			if(i%2==0 && i%7==0)
			{
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
}
		
class BookTest8
{
	public static void main(String[] args)
	{
		int m = 1;
		for(int i=1; i<=10; i++)
		{
			m *= i;
		}
		System.out.println(m);
	}
}

class BookTest9
{
	public static void main(String[] args)
	{
		int m = 1;
		for(int i=1; i<=9; i++)
		{
			m = 5*i;
			System.out.println("5 * " + i + " = " + m);
		}
	}
}

class BookTest10
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int num=0; num<100; num++)
		{
			if(num%5 != 0 || num%7 != 0) continue;
			count++;
			System.out.println(num);
		}
		System.out.println(count);
	}
}

class BookTest11
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		while(true)
		{
			i++;
			if(i%2 == 0) continue;
			sum += i;
			if(sum > 1000) 
			{
				System.out.println(i);
				System.out.println(sum);
				break;
			}
		}
	}
}

class BookTest12
{
	public static void main(String[] args)
	{
		int m = 1;
		for(int i=0; i<=9; i=i+2)
		{
			for(int j=1;j<=i;j++)
			{
				m = i * j;
				System.out.println(i + " * " + j + " = " + m);
				
			}
			System.out.println();
		}
	}
}

class BookTest13
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i=0; i<=9; i++)
		{
			for(int j=0; j<=9; j++)
			{
				if(i+j==9)
				{
					System.out.println((i*10+j) + " + " + (j*10+i) + " = 99");
				}
			}
		}
	}
} 