import java.util.Scanner;

public class PhoneInfoMain {
    public static void main(String[] args) {
        PhoneInfo info = null;
        Scanner sc = new Scanner(System.in, "EUC-KR");
        Manager m = new Manager();

        while (true) {
            System.out.println("선택하세요.");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 모든 데이터 보기");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (choice) {
                case 1:
                    m.save();
                    break;
                case 2:
                    m.search();
                    break;
                case 3:
                    m.delete();
                    break;
                case 4:
                   m.print();
                   break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 선택하셨습니다.");
            }
        }
    }
}

class Manager {
    PhoneInfo info = null;
    Scanner sc = new Scanner(System.in, "EUC-KR");
    // String name = null, phone = null, birth = null;
    String name, phone, birth;
    PhoneInfo[] infoArr = new PhoneInfo[100];
    int cnt = 0;
    boolean sflag = false;
    int idx = 0;

    public void save() {
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("전화번호 : ");
        phone = sc.nextLine();
        System.out.print("생년월일 : ");
        birth = sc.nextLine();
        info = new PhoneInfo(name, phone, birth);
        infoArr[cnt++] = info;
        System.out.println("데이터 입력이 완료되었습니다.");
        System.out.println();
    }

    public void search() {
        System.out.println("검색하시고자 하는 이름을 입력하세요.");
        name = sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            if (name.equals(infoArr[i].getName())) {
                infoArr[i].showPhoneInfo();
                sflag = true;
                System.out.println();
            }
        }
        if (!sflag) {
            System.out.println("검색하시고자 하는 사람이 없습니다.");
            System.out.println();
        }
        sflag = false;
    }

    public void delete() {
        System.out.println("삭제하시고자 하는 이름을 입력하세요.");
        name = sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            if (name.compareTo(infoArr[i].getName()) == 0) {
                idx = i;
                sflag = true;
                break;
            }
        }
        if (!sflag) {
            System.out.println("삭제하시고자 하는 사람이 없습니다.");
            System.out.println();
        }
        else {
            for (int i = idx; i < cnt - 1; i++)
                infoArr[i] = infoArr[i + 1];
            infoArr[cnt - 1] = null;
            cnt--;
            sflag = false;
            System.out.println("삭제가 완료되었습니다.");
            System.out.println();
        }
    }

    public void print() {
        for (int i = 0; i < cnt; i++) {
            infoArr[i].showPhoneInfo();
            System.out.println();
        }
    }
}

class PhoneInfo
{
    private String name;
    private String phone;
    private String birth;
/*
    public PhoneInfo(String name, String phone, String birth)
    {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }
    public void showPhoneInfo()
    {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("birth : " + birth);
    }
*/
	public String initPhoneInfo(String name, String phone, String birth)
	{
		this.name = name;
		this.phone = phone;
		this.birth = birth;

		return name;
	}
	
    public String getName()
    {
        return name;
    }
}
