class WhileAdd7
{
	public static void main(String[] args)
	{
		int i=7, sum=0, count=0;

		while(sum<=1000)
		{
			sum = sum + i;
			count=count+1;
			System.out.println("count=" + count + " i=" + i + " sum=" + sum);
			i=i+7;
		}
	}
}