class WhileTest4_1
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		int count = 0;
		while(sum<=1000)
		{
			i = i + 7;
			sum = sum + i;
			count = count + 1;
			System.out.println(i + " " + count + " " + sum);
		}
		System.out.println(i + " " + count + " " + sum);
	}
}

