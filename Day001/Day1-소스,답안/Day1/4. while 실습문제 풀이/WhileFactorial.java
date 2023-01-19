class WhileFactorial
{
	public static void main(String[] args)
	{
		int i=1, result=1;

		while(i<=5)
		{
			result = result * i;
			System.out.println("i=" + i + " result=" + result);
			i=i+1;
		}
	}
}