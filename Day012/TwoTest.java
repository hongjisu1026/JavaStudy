class TwoTest
{
	public static void main(String[] args)
	{
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		addTwoDArr(arr, 7);

		for (int i = 0; i < arr.length; i++) {
            		for (int j = 0; j < arr[i].length; j++) {
                			System.out.print(arr[i][j] + " ");
           			}
           			 System.out.println();
       		}
	}

	public static void addOneDArr(int[] arr, int add)
	{
		for(int i=0;i<arr.length; i++)
			arr[i] += add;
	}

	public static void addTwoDArr(int[][] arr, int add)
	{
		
		for(int i=0; i<arr.length; i++)
			addOneDArr(arr[i], add);
	}
}

class TwoTest2
{
	public static void main(String[] args)
	{
		int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

		switchTwoDArr(arr);

		for(int i=0; i < arr.length; i++) {
            		for (int j = 0; j < arr[i].length; j++) {
                			System.out.print(arr[i][j] + " ");
           			}
           			 System.out.println();
       		}
	}

	

	public static void switchTwoDArr(int[][] arr)
	{	
		int[] temp = arr[2];	
		
		for(int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}

		arr[0] = temp;

	}
}		


		
