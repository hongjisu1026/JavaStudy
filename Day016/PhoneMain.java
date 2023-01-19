import java.util.Scanner;

class PhoneMain {
	public static void main(String[] args) {
		Scanner sc = PhoneBookUI.sc;
        		final int SAVE_DATA = 1;
        		final int FIND_DATA = 2;
        		final int DELETE_DATA = 3;
        		final int PRINT_ALL_DATA = 4;
        		final int END_PROGRAM = 5;

        		while (true) {
            		PhoneBookUI.choiceMenu();
            		int choice = sc.nextInt();
            		sc.nextLine(); //버퍼에 남은 엔터값 지우기
            		System.out.println();
           			 switch (choice) {
                			case SAVE_DATA:
                    				PhoneBookUI.saveDataUI();
                    				break;
                			case FIND_DATA:
                    				PhoneBookUI.findDataUI();
                    				break;
                			case DELETE_DATA:
                    				PhoneBookUI.deleteDataUI();
                    				break;
                			case PRINT_ALL_DATA:
                    				PhoneBookUI.printAllDataUI();
                    				break;
                			case END_PROGRAM:
                    				PhoneBookUI.endProgram();
                    				return;
                			default:
                    				PhoneBookUI.wrongNumber();
            		}
       		}
	}
}

class PhoneInfo {
	private String name, phone, birth;

	PhoneInfo(String name, String phone, String birth) {
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}

	PhoneInfo(String name, String phone) {
		this(name, phone, null);
	}

	public void showPhoneInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("생년월일 : " + birth);
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
}

class PhoneBookUI {
	public static Scanner sc = new Scanner(System.in, "EUC-KR");
	private static PhoneBook pb = new PhoneBook();	

	private PhoneBookUI() {		}

	public static void choiceMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 모든 데이터 보기");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}


	public static void saveDataUI() {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("생년월일 : ");
		String birth = sc.nextLine();

		boolean result = pb.saveData(name, phone, birth);
		if(result) {
			System.out.println("데이터 입력이 완료되었습니다.");
			System.out.println();
		} else {
			System.out.println("데이터 용량이 꽉찼습니다.");
			System.out.println();
		}
	}

	public static void findDataUI() {
		System.out.println("=====사용자 정보 검색=====");
		System.out.println("찾으시는 이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("사용자 검색을 시작합니다...");
		if (!pb.findData(name)) {
			System.out.println("찾으시는 사용자가 없습니다.");
		}
		System.out.println();	
	}
	
	public static void deleteDataUI() {
		System.out.println("=====사용자 정보 삭제=====");
		System.out.println("삭제하고자 하는 전화번호를 입력해주세요.");
		String phone = sc.nextLine();
		System.out.println("사용자 삭제를 시작합니다...");
		boolean result = pb.deleteData(phone);
		if (!result) {
			System.out.println("삭제하시고자 하는 사용자가 없습니다.");
		} else {
			System.out.println("삭제가 완료되었습니다.");
		}
		System.out.println();
	}

    	public static void printAllDataUI() {
        		System.out.println("=====모든 정보 출력=====");
        		pb.showAllData();
    	}

    	public static void endProgram() {
        		System.out.println("프로그램을 종료합니다.");
        		sc.close();
    	}

    	public static void wrongNumber() {
        		System.out.println("잘못 입력하셨습니다.");
        		System.out.println();
    	}
}

class PhoneBook {
	private PhoneInfo[] pArr = new PhoneInfo[100];	
	private int count = 0;

	// 데이터 저장 메소드
	public boolean saveData(String name, String phone, String birth) {
		if(count > 100) {
			return false;
		}

		pArr[count++] = new PhoneInfo(name, phone, birth);
		return true;
	}

	// 데이터 검색 메소드
	public boolean findData(String name) {
		boolean flag = false;
 		for(int i = 0; i < count; i++) {
			if(name.compareTo(pArr[i].getName()) == 0) {
				pArr[i].showPhoneInfo();
				flag = true;
			}
		}
		return flag;
	}	

	// 데이터 삭제 메소드
	public boolean deleteData(String phone) {
		boolean flag = false;
		for(int i = 0; i < count; i++) {
			if(phone.compareTo(pArr[i].getPhone()) == 0) {
				for(int j = i; j < count - 1; j++) {
					pArr[j] = pArr[j+1];
				}
				flag = true;
				pArr[count-1] = null;
				count --;
			}
		}
		return flag;
	}

	public void showAllData() {
		for(int i = 0; i < count; i++) {
			pArr[i].showPhoneInfo();
		}
	}
}	
		