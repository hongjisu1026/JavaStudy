import java.util.Scanner;

class InstanceArray
{
	public static void main(String[] args)
	{
		int[] numArr = new int[5];
		int len = numArr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력해주세요.");
		for(int i=0; i<len; i++)
		{
			numArr[i] = sc.nextInt();
		}

		System.out.println("최대값 : " + maxValue(numArr));
		System.out.println("최소값 : " + minValue(numArr));
	}

	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > max)
				max = arr[i];				
		}
		return max;
	}

	public static int minValue(int[] arr)
	{
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];				
		}
		return min;
	}
}
		