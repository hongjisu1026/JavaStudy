import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {		
		
		final int SIZE = 5;
		int[] num = new int[SIZE];
		Scanner sc = new Scanner(System.in);
		int len = num.length;
		
		for(int i=0;i<len-1;i++)
		{
			System.out.println(i+1+"번째 수를 입력하세요.");
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
			System.out.print(num[i] + " ");
		
	}
}