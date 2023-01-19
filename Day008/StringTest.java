import java.util.Scanner;

class StringTest1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");

		String str = null;
		
		System.out.println("문자를 입력해주세요");
		str = sc.nextLine();
		int num = str.length();
		System.out.println(num);
	}
}

class StringTest2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");

		String str1 = null;
		String str2 = null;
		
		System.out.println("문자를 입력해주세요");
		str1 = sc.nextLine();
		System.out.println("문자를 입력해주세요");
		str2 = sc.nextLine();
		String str3 = str1.concat(str2);
		System.out.println(str3);
	}
}

class StringTest3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");

		String str1 = null;
		
		System.out.println("문자를 입력해주세요");
		str1 = sc.nextLine();
		String str2 = str1.toLowerCase();
		System.out.println(str2);
	}
}

class StringTest4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");

		String str1 = null;
		
		System.out.println("문자를 입력해주세요");
		str1 = sc.nextLine();
		String str2 = str1.toUpperCase();
		System.out.println(str2);
	}
}

class StringTest5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");

		String str1, str2, str3, str4, str5, temp;
		
		System.out.println("문자를 입력해주세요");
		str1 = sc.nextLine();
		System.out.println("문자를 입력해주세요");
		str2 = sc.nextLine();
		System.out.println("문자를 입력해주세요");
		str3 = sc.nextLine();
		System.out.println("문자를 입력해주세요");
		str4 = sc.nextLine();
		System.out.println("문자를 입력해주세요");
		str5 = sc.nextLine();

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

		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
	}
}

class StringTest6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영숫자 입력");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		int num = (int)ch;

		if(num>=65 && num<=90)
		{
			System.out.println(ch + "는 대문자");
		} else if(num>=97 && num<=122)
		{
			System.out.println(ch + "는 소문자");
		} else if(num>=48 && num<=57)
		{
			System.out.println(ch + "는 숫자");
		} else
		{
			System.out.println("입력한 값은 영숫자가 아닙니다.");
		}
	}
}

class StringTest7
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

class StringTest8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		String str = Integer.toBinaryString(temp);
		int num = str.length();
		
		for(int i=num; i<32; i++)
		{
			System.out.print("0");
		}
		System.out.print(str);
	
	}
}