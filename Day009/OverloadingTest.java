import java.util.Scanner;

class OverloadingTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요");
		String str = sc.nextLine();
		char ch1 = str.charAt(0);
		print(ch1);

		System.out.println("숫자를 입력해주세요");
		int num1 = sc.nextInt();
		print(num1);
	}

	public static void print(int num)
	{
		char ch = (char) num;
		System.out.println(ch);
	}

	public static void print(char ch)
	{
		int num = (int) ch;
		System.out.println(num);
	}
}