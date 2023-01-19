class RecursiveMethod {

    public static void main(String[] var0) {
        System.out.println("Start");
        reHi(3);
        System.out.println("End");
    }

    public static void reHi(int var0) {
        if (var0 != 0) {
            System.out.println("Hi");
            reHi(var0 - 1);
            System.out.println("Bye");
        }
    }
}

class RecursiveMethod1
{
	public static void main(String[] args)
	{
		System.out.println(factorial(5));
	}

	public static int factorial (int num)
	{
		if(num==1) return 1;
		return num*factorial(num-1);
	}
}

class RecursiveMethod2
{
	public static void main(String[] args)
	{
		System.out.println(add(5));
	}
		
	public static int add(int num)
	{
		if(num==0) return 0;
		return num+add(num-1);
	}
}

class RecursiveMethod3
{
	public static void main(String[] args)
	{
		System.out.println(multiply(10));
	}
	
	public static int multiply(int num)
	{
		int n=1;
		for(int i = 1; i<=num; i++)
		{
			if(num>0)
			{
				n *= 2;
				multiply(num-1);
			} else if(num == 0)
			{
				return 0;
			}
		}
		return n;
	}
}


class RecursiveMethod4
{
	public static void main(String[] args)
	{
		binary(15);
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

class RecursiveMethod5
{
	public static void main(String[] args)
	{
		System.out.println(fibonacci(7));
	}
	
	public static int fibonacci(int num)
	{
		if(num<=1)
		return num;
		else
		return fibonacci(num-2) + fibonacci(num-1);
			
	}
}

