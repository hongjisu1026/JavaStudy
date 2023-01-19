class WhileAddEven
{
	public static void main(String[] args)
	{
		int i=2, sum=0;

		while(i<=100)
		{
			sum = sum + i;
			System.out.println("i=" + i + " sum = " + sum);
			i = i + 2;
		}
	}
}