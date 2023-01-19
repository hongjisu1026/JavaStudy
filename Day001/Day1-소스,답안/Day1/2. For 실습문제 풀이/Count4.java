class Count4
{
	public static void main(String[] args)
	{
		int i=4, count=0;

		for(i=4;i<=100;i=i+4)
		{
			count=count+1;
			System.out.println("i=" + i + " count = " + count);
		}
	}
}