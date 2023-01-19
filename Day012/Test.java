import java.util.Scanner;

class PhoneMain
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택 : ");
			Scanner sc = new Scanner(System.in, "EUC-KR");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("전화번호 : ");
				String phone = sc.nextLine();
				System.out.print("생년월일 : ");
				String birth = sc.nextLine();
				PhoneInfo info = new PhoneInfo(name, phone, birth);

				info.showPhoneInfo();
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
			
	}
}

class PhoneInfo
{
	private String name, phone, birth;

	PhoneInfo(String name, String phone, String birth)
	{
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	
	PhoneInfo(String name, String phone)
	{
		this(name, phone, null);
	}

	public void showPhoneInfo()
	{
		System.out.printf("name : %s \n", name);
		System.out.printf("phone : %s \n", phone);
		System.out.printf("birth : %s \n", birth);
	}	
}

class SortTest1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int len = numArr.length;

		for(int i=0; i<len; i++)
		{
			System.out.println(i+1 + "번째 숫자를 입력해주세요");
			numArr[i] = sc.nextInt();
		}

		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(numArr[i] > numArr[j])
				{
					int temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}

		for(int i=0; i<len; i++)
		{
			System.out.print(numArr[i] + "  ");
		}
	}
}

class SortTest2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[5];
		int len = numArr.length;

		for(int i=0; i<len; i++)
		{
			System.out.println(i+1 + "번째 숫자를 입력해주세요");
			numArr[i] = sc.nextInt();
		}

		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1-i;j++)
			{
				if(numArr[j]>numArr[j+1])
				{
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}

		for(int i=0; i<len; i++)
		{
			System.out.print(numArr[i] + "  ");
		}
	}
}

/*
문제 4번
str1.compareTo(str2);
str1.equals(str2);
*/

class Test5
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=1; j<=3; j++)
			{
				for(int k=2; k<5; k++)
				{
					int num = k + (i * 3);
					if(num<10)
					System.out.printf("%d * %d = %d \t", num, j, num*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

class Test6
{
	public static void main(String[] args)
	{
		for(int i=2; i<=9; i++)
		{
			System.out.println(i + "단"); 
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%d * %d = %d \n", i, j, i*j);
			}
			System.out.println();
		}
	}
}

class Test7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");
		System.out.println("이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.printf("이름 : %s", name);
	}
}

class Test8
{
	public static void main(String[] args)
	{
		double num = 1.234567;
		System.out.printf("소수점 둘째자리에서 반올림 : %.2f", num);
	}
}

class Test9
{
	public static void main(String[] args)
	{
		double num = 1.234567;
		System.out.printf("소수점 둘째자리에서 반올림 : %10.2f", num);
	}
}

class Test10
{
	public static void main(String[] args)
	{
		char ch = 'A';
		System.out.printf("%c", ch);
	}
}

class Test11
{
	public static void main(String[] args)
	{
		int sum = 0;
		int total = 0;
		for(int i=1; i<=10; i++)
		{
			sum += i;
			total += sum;
		}
		System.out.println(total);
	}
}

class Test12
{
	public static void main(String[] args)
	{
		int sum = 0;
		int num = 1;
		int s = 1;
		for(int i=1; sum<100; i++, s=-s)
		{
			num = i * s;
			sum += num;	
		}
		System.out.println("num = " + num);
	}
}

class Test13
{
	public static void main(String[] args)
	{
		int sum = 0;
		String str = "12345";
		for(int i=0; i < str.length(); i++) 
		{
			sum += str.charAt(i) - '0';
		}
		System.out.println("sum = " + sum);
	}
}

class Test14
{
	public static void main(String[] args)
	{
		int num = 12345;
		int sum = 0;
	
		while(num > 0) 
		{
			sum += num%10;
			num /= 10;
		}
		System.out.println("sum = " + sum);
	}
}

class Test15
{
	public static void main(String[] args)
	{
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;

		for(int i=0; i<8; i++)
		{
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
		System.out.println("피보나치 수열의 열번째 수 : " + num3);
	}
}

class Test16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean flag = true;

		for(int i=0; i<str.length(); i++)
		{
			if(!(str.charAt(i)>='0' && str.charAt(i)<='9'))
			{
				flag = false;
				break;
			}			
		}

		if(flag)
			System.out.println("당신이 입력한 문자열은 숫자입니다.");
		else
			System.out.println("당신이 입력한 문자열은 숫자가 아닙니다.");
	}
}

class Test17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int result = 0;

		while(temp!=0)
		{
			result = result*10 + temp%10;
			temp /= 10;
		}

		if(num == result)
			System.out.println("당신이 입력한 숫자는 회문수입니다.");
		else
			System.out.println("당신이 입력한 숫자는 회문수가 아닙니다.");
	}
}	

		
		