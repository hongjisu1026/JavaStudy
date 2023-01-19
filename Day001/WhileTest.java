class WhileTest
{
	public static void main(String[] args)
	{
		int i=0;
		while(i<3)
		{
			i++;
			System.out.println(i + "Hi");
		}
	}
}

class WhileTest1
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		while(i<100)
		{
			i ++;
			sum = sum + i;
			System.out.println(sum);
		}
	}
}

class WhileTest2
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		while(i<100)
		{
			i = i + 2;
			sum = sum + i;
			System.out.println(sum);
		}
	}
}

class WhileTest3
{
	public static void main(String[] args)
	{
		int i = 0;
		int count = 0;
		while(i<100)
		{
			i = i + 4;
			count = count + 1;
			System.out.println(i+ " " + count);
		}
	}
}

class WhileTest4
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		int count = 0;
		while(sum<=1000)
		{
			i = i + 7;
			sum = sum + i;
			count = count + 1;
			System.out.println(i + " " + count + " " + sum);
		}
	}
}

class WhileTest5
{
	public static void main(String[] args)
	{
		int i = 0;
		int m = 1;
		while(i<5)
		{
			i = i + 1;
			m = m * i;
			System.out.println(m);
		}
	}
}








