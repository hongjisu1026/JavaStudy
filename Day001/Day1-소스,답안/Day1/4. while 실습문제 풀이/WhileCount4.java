class WhileCount4
{
	public static void main(String[] args)
	{
		int i=4, count=0;

		while(i<=100)
		{
			count=count+1;
			System.out.println("i=" + i + " count = " + count);
			i=i+4;
		}
	}
}