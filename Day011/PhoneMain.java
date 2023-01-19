import java.util.Scanner;

class PhoneMain
{
	public static void main(String[] args)
	{		
		while(true)
		{
			Scanner sc = new Scanner(System.in, "EUC-KR");
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();

			if(choice == 1)
			{
				System.out.print("이름 : ");
				String name = sc.nextLine();

				System.out.print("전화번호 : ");
				String phone = sc.nextLine();

				System.out.print("생년월일 : ");
				String birth = sc.nextLine();

				System.out.println("입력이 완료됐습니다.");
				System.out.println();
			
				System.out.println("입력된 정보 출력...");
				PhoneInfo info = new PhoneInfo(name, phone, birth);
				info.showPhoneInfo();
				System.out.println();
				
			} else if(choice == 2)
			{
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}

class PhoneInfo
{
	private String name, phoneNumber, birthday;
	
	PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfo(String name, String phoneNumber)
	{
		this(name, phoneNumber, null);
	}

	public void showPhoneInfo()
	{
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		System.out.println("birth : " + birthday);
	}	

	public String toString()
	{
		return name + " " + phoneNumber + " " + birthday ;
	}
}