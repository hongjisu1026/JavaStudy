import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {		
		
		final int SIZE = 5;
		int[] num = new int[SIZE];
		Scanner sc = new Scanner(System.in);
		int temp;
		int len = num.length;
		
		for(int i=0;i<len;i++)
		{
			System.out.println(i+1+"번째 수를 입력하세요.");
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(num[i]>num[j])
				{
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		for(int i=0;i<len;i++)
			System.out.print(num[i] + " ");
	}
}