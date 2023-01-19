// 0. 4byte
// 1. b, c, e
// 2. 2^16

import java.util.Scanner;

class Test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		System.out.println(str.length());
	}
}

class Test2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str1 = sc.nextLine();
		System.out.println("문자열 입력");
		String str2 = sc.nextLine();
		System.out.println(str1.concat(str2));
	}
}

class Test3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		System.out.println(str.toLowerCase());
	}
}

class Test4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		System.out.println(str.toUpperCase());
	}
}

class Test5
{
	public static void main(String[] args)
	{
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str1 = sc.nextLine();
		System.out.println("문자열 입력");
		String str2 = sc.nextLine();
		System.out.println("문자열 입력");
		String str3 = sc.nextLine();
		System.out.println("문자열 입력");
		String str4 = sc.nextLine();
		System.out.println("문자열 입력");
		String str5 = sc.nextLine();

		if(str1.compareTo(str2)>0)
		{
			temp = str1;
			str1 = str2;
			str2 = temp;
		}
		if(str1.compareTo(str3)>0)
		{
			temp = str1;
			str1 = str3;
			str3 = temp;
		}
		if(str1.compareTo(str4)>0)
		{
			temp = str1;
			str1 = str4;
			str4 = temp;
		}
		if(str1.compareTo(str5)>0)
		{
			temp = str1;
			str1 = str5;
			str5 = temp;
		}
		if(str2.compareTo(str3)>0)
		{
			temp = str2;
			str2 = str3;
			str3 = temp;
		}
		if(str2.compareTo(str4)>0)
		{
			temp = str2;
			str2 = str4;
			str4 = temp;
		}
		if(str2.compareTo(str5)>0)
		{
			temp = str2;
			str2 = str5;
			str5 = temp;
		}
		if(str3.compareTo(str4)>0)
		{
			temp = str3;
			str3 = str4;
			str4 = temp;
		}

		if(str3.compareTo(str5)>0)
		{
			temp = str3;
			str3 = str5;
			str5 = temp;
		}
		if(str4.compareTo(str5)>0)
		{
			temp = str4;
			str4 = str5;
			str5 = temp;
		}
		System.out.println(str1 + "  " + str2 + "  " + str3 + "  " + str4 + "  " + str5);
	}
}

class Test6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("영숫자 입력");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int num = (int)ch;

		// ASCII (48~57) - 숫자 / (65~90) - 대문자 / (97~122) - 소문자
		if(num>=48 && num<=57)
		{
			System.out.println(str + "은 숫자입니다.");
		} else if(num>=65 && num<=90)
		{
			System.out.println(str + "은 대문자입니다.");
		} else if(num>=97 && num<=122)
		{
			System.out.println(str + "은 소문자입니다.");
		} else
		{
			System.out.println("입력한 값은 영숫자가 아닙니다.");
		}	
	}
}

class Test7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자 입력");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int num = (int)ch;
		if(num>=65 && num<=90)
		{
			System.out.println(str.toLowerCase());
		} else if(num>=97 && num<=122)
		{
			System.out.println(str.toUpperCase());
		} else
		{
			System.out.println("입력한 값은 영문자가 아닙니다.");
		}
	
	}
}

// satic메소드