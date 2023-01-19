class Factorial
{
	public static void main(String[] args)
	{
		int i=1, result=1;

		for(i=1;i<=5;i=i+1)
		{
			result = result * i;
			System.out.println("i=" + i + " result=" + result);
		}
	}
}