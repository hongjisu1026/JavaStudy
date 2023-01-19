class AddEven
{
	public static void main(String[] args)
	{
		int i=2, sum=0;

		for(i=2;i<=100;i=i+2)
		{
			sum = sum + i;
			System.out.println("i=" + i + " sum = " + sum);
		}
	}
}