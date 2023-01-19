import java.util.Scanner;

class RCPTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");
		
		int com = (int)(Math.random()*3)+1;
		System.out.println("선택해주세요");
		System.out.println("1. 가위 2. 바위 3. 보");
		int user = sc.nextInt();
		
		String[] strArr = {"가위", "바위", "보"};
		System.out.println("com : " + strArr[com-1]);
		System.out.println("you : " + strArr[user-1]);

		switch(com-user)
		{
		case -2: case 1:
			System.out.println("당신이 졌습니다.");
			break;
		case -1: case 2:
			System.out.println("당신이 이겼습니다.");
			break;
		default:
			System.out.println("비겼습니다");
		}			
	}
}

		