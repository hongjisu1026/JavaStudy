class AddSum
{
	public static void main(String[] args)
	{
		int i=1, sum=0;

		for(i=1;i<=100;i=i+1)
		{
			sum = sum + i;
			System.out.println("i=" + i + " sum = " + sum);
		}
	}
}