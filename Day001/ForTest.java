class ForTest1
{
	public static void main(String[] args)
	{
		// int i = 0;
		// int sum = 0;
		int i = 0, sum = 0;
		for(i=1;i<=100;i=i+1)
		{
			sum = sum + i;
			System.out.println("1부터 100까지의 합 = " + sum);
		}
	}
}

class ForTest2
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		for(i=1;i<=100;i++)
		{
			if(i%2==0)
			sum = sum + i;
		}	
		System.out.println("1부터 100까지 짝수의 합 = " + sum);
	}
}

class ForTest3
{
	public static void main(String[] args)
	{
		int i = 0;
		int count = 0;
		for(i=1;i<=100;i++)
		{
			if(i%4==0)
			count++;
		}	
		System.out.println("1부터 100까지 4의 배수의 갯수 = " + count);
	}
}

class ForTest4
{
	public static void main(String[] args)
	{
		int i=0, sum = 0, count = 0;
		for(i=0;sum<=1000;i=i+7)
		{
			sum = sum + i;
			count++;

			System.out.println(i + " " + count + " " + sum);
		}	
	}
}

class ForTest5
{
	public static void main(String[] args)
	{
		int i;
		int m=1;
		for(i=1;i<=5;i++)
		{
			m = m * i;
		}	
		System.out.println("5! = " + m);	
	}
}





