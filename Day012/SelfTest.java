class SelfTest1
{
	public static void main(String[] args)
	{
		int[][] numArr = new int[3][3];
		practice1(numArr);
	}

	public static void practice1(int[][] arr)
	{

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
	}
}

class SelfTest2
{
	public static void main(String[] args)
	{
		int[][] numArr = new int[4][4];
		practice2(numArr);
	}

	public static void practice2(int[][] arr)
	{

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print((i*4+j+1) + " ");
			}
			System.out.println();
		}
	}
}

class SelfTest3
{
	public static void main(String[] args)
	{
		int[][] numArr = new int[4][4];
		practice3(numArr);
	}

	public static void practice3(int[][] arr)
	{
		int num=16;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = num--;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class SelfTest4
{
	public static void main(String[] args)
	{
		int[][] numArr = new int[4][4];
		practice4(numArr);

		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void practice4(int[][] arr)
	{
		int len = arr.length;
		int num=16;
		for(int i=0; i<len-1; i++)
		{
			for(int j=0; j<arr[i].length-1; j++)
			{
				int num = (int)(Math.random()*10)+1;
				arr[i][j] = num;
				int sum = 0;
				sum += arr[i][j];
				arr[len] = sum;
			}
			System.out.println();
		}
	}
}