class BreakTest1
{
	public static void main(String[] args)
	{	
		int i = 0;
		int sum = 0;
		for(i = 1; true; i++)
		{
			sum += i;
			if (sum >= 5000) break;
		}
		System.out.println(sum);
	}
}

class BreakTest2
{
	public static void main(String[] args)
	{
		int i = 0;
		while(i<20)
		{
			i++;
			if(i%2==0 || i%3==0) continue;
			System.out.println(i);
		}
	}
}

class BreakTest3
{
	public static void main(String[] args)
	{
		int i = 0;
		for(i=1;true;i++) 
		{
			if(i%5==0 && i%7==0) break;
		}
		System.out.println(i);
	}
}

class BreakTest4
{
	public static void main(String[] args)
	{
		int i = 0;
		int count = 0;
		while(i<100)
		{ 
			i++;
			if(i%5!=0 || i%7!=0) continue;
			count++;
			System.out.println(i);
		}
		System.out.println(count);
	}
}
			