class DoWhileTest
{
	public static void main(String[] args)
	{
		int i = 10;
		do {
			System.out.println("Hi");
			i++;
		} while(i<3);
	}
}

class DoWhileTest1
{
	public static void main(String[] args)
	{
		int i = 0, sum = 0;
		do {
			i++;
			sum += i;
			System.out.println(sum);
		} while(i<100);
	}
}

class DoWhileTest2
{
	public static void main(String[] args)
	{
		int i = 0, sum = 0;
		do {
			i += 2;
			sum += i;
			System.out.println(sum);
		} while(i<100);
	}
}

class DoWhileTest3
{
	public static void main(String[] args)
	{
		int i = 4, count = 0;
		do {
			i += 4;
			count++;
			System.out.println(count);
		} while(i<=100);

	}
}

class DoWhileTest4
{
	public static void main(String[] args)
	{
		int i = 0, sum = 0, count = 0;
		do {
			i += 7;
			count++;
			sum += i;
			System.out.println(i + " " + count + " " + sum);
		} while(sum<=1000);	
	}
}

class DoWhileTest5
{
	public static void main(String[] args)
	{
		int i = 0, fac = 1;
		do {
			i++;
			fac *= i;
			System.out.println(fac);
		} while(i<5);
	}
}