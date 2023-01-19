class ForEachTest
{
	public static void main(String[] args)
	{
		int[] arr = {6, 2, 3, 4, 5};

		System.out.println("최소값 : " + minValue(arr));
		System.out.println("최대값 : " + maxValue(arr));
	}

	public static int minValue(int[] arr)
	{
		int min = arr[0];
		for(int e: arr)
		{
			if(min>e)
				min = e; 
		}
		return min;
	}

	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for(int e: arr)
		{
			if(max < e)
				max = e; 
		}
		return max;
	}
}