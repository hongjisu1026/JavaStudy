import java.util.Scanner;

class PhoneMain implements MenuString {
    public static void main(String[] args) {
        Scanner sc = PhoneBookUI.sc;


        while (true) {
            PhoneBookUI.choiceMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // 엔터 지우기
            System.out.println();

            switch (choice) {
                case SAVE_DATA:
                    PhoneBookUI.saveMenuUI();
                    break;
                case FIND_DATA:
                    PhoneBookUI.findDataUI();
                    break;
                case DELETE_DATA:
                    PhoneBookUI.deleteDataUI();
                    break;
                case SHOW_ALL_DATA:
                    PhoneBookUI.showAllDataUI();
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
    private String name, phone;

    PhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showPhoneInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
    }

    public String getName() {
        return name;
    } // 이름 가져오기

    public String getPhone() {
        return phone;
    } // 전화번호 가져오기
}

class PhoneUnivInfo extends PhoneInfo {
    String major;
    int year;

    PhoneUnivInfo(String name, String phone, String major, int year) {
        super(name, phone);
        this.major = major;
        this.year = year;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + year);
    }

}

class PhoneCompanyInfo extends PhoneInfo {
    String company;

    PhoneCompanyInfo(String name, String phone, String company) {
        super(name, phone);
        this.company = company;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("회사 : " + company);
    }
}

class PhoneBook {
    private PhoneInfo[] pArr = new PhoneInfo[100];
    private int count = 0;

    // (일반) 데이터 입력 메소드
    public boolean saveData(String name, String phone) {
        return insertionSort(new PhoneInfo(name, phone));
    }

    // (대학) 데이터 입력 메소드
    public boolean saveUnivData(String name, String phone, String major, int year) {
        return insertionSort(new PhoneUnivInfo(name, phone, major, year));
    }

    // (회사) 데이터 입력 메소드
    public boolean saveCompanyData(String name, String phone, String company) {
        return insertionSort(new PhoneCompanyInfo(name, phone, company));
    }

    // 삽입 정렬
    public boolean insertionSort(PhoneInfo info) {
        int i = 0, j = 0;
        if (count >= pArr.length) {
            System.out.println("더 이상 저장할 수 없습니다.");
            return false;
        }
        for (i = 0; i < count; i++) {
            if (pArr[i].getName().compareTo(info.getName()) > 0) {
                for (j = count - 1; j >= i; j--) {
                    pArr[j + 1] = pArr[j];
                }
                break;
            }
        }
        pArr[i] = info;
        count++;
        return true;
    }

    // 데이터 검색 메소드
    public void searchData(String name) {
        int result = binarySearch(name);
        if (result != -1) {
            pArr[result].showPhoneInfo();
        } else {
            System.out.println("찾으시는 데이터가 없습니다.");
        }
    }

    // 이진 검색
    public int binarySearch(String name) {
        int start = 0;
        int end = count - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (pArr[mid].getName().compareTo(name) == 0) {
                return mid;
            } else if (pArr[mid].getName().compareTo(name) < 0) {
                start = mid + 1;
            } else if (pArr[mid].getName().compareTo(name) > 0) {
                end = mid - 1;
            }
        }
        return -1;
    }

    // 데이터 삭제 메소드
    public boolean deleteData(String phone) {
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if (phone.compareTo(pArr[i].getPhone()) == 0) {
                for (int j = i; j < count - 1; j++) {
                    pArr[j] = pArr[j + 1];
                }
                flag = true;
                pArr[count - 1] = null;
                count--;
            }
        }
        return flag;
    }

    // 전체 데이터 출력 메소드
    public boolean showAllData() {
        boolean flag = false;
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                pArr[i].showPhoneInfo();
                flag = true;
            }
        }
        return flag;
    }
}


class PhoneBookUI implements MenuString{

    private static PhoneBook pb = new PhoneBook();
    public static Scanner sc = new Scanner(System.in, "EUC-KR");

    private PhoneBookUI() {
    }

    public static void choiceMenu() {
        System.out.println("===== 전화번호부 =====");
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.println();
        System.out.print("선택 : ");
    }

    public static void saveMenuUI() {
        System.out.println("===== 데이터 입력 =====");
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case COMMON:
                saveDataUI();
                break;
            case UNIV:
                saveUnivDataUI();
                break;
            case COMPANY:
                saveCompanyDataUI();
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }
    }

    public static void saveDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();

        boolean result = pb.saveData(name, phone);
        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
            System.out.println();
        }
    }

    public static void saveUnivDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("전공 : ");
        String major = sc.nextLine();
        System.out.print("학년 : ");
        int year = sc.nextInt();

        boolean result = pb.saveUnivData(name, phone, major, year);
        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
            System.out.println();
        }
    }

    public static void saveCompanyDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("회사 : ");
        String company = sc.nextLine();

        boolean result = pb.saveCompanyData(name, phone, company);
        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
            System.out.println();
        }
    }


    public static void findDataUI() {
        boolean result = false;
        System.out.println("===== 데이터 검색 =====");
        System.out.println("데이터 검색을 시작합니다.");
        System.out.println();
        System.out.println("검색할 이름을 입력해주세요.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.println();

        pb.searchData(name);
    }

    public static void deleteDataUI() {
        boolean result;
        System.out.println("===== 데이터 삭제 =====");
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.println();
        System.out.println("삭제할 전화번호를 입력해주세요");
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.println();

        while(true) {
            System.out.println("정말 삭제 하시겠습니까?");
            System.out.println("( Y / N )");
            String choiceYN = sc.nextLine().toLowerCase();
            if (choiceYN.equals(YES)) {
                result = pb.deleteData(phone);
                if (result) {
                    System.out.println("데이터 삭제가 완료되었습니다.");
                    break;
                } else {
                    System.out.println("찾으시는 데이터가 존재하지 않습니다.");
                    break;
                }
            } else if (choiceYN.equals(NO)) {
                System.out.println("취소되었습니다.");
                break;
            } else {
                System.out.println("잘못 선택하셨습니다.");
            }
        }
    }

    public static void showAllDataUI() {
        boolean result;
        System.out.println("===== 모든 데이터 보기 =====");

        result = pb.showAllData();

        if (!result) {
            System.out.println("입력된 데이터가 없습니다.");
            System.out.println();
        }
    }

    public static void endProgram() {
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    public static void wrongNumber() {
        System.out.println("잘못 선택하셨습니다.");
        System.out.println("다시 시도해주세요.");
        System.out.println();
    }
}

interface MenuString {
    int COMMON = 1;
    int UNIV = 2;
    int COMPANY = 3;
    int SAVE_DATA = 1;
    int FIND_DATA = 2;
    int DELETE_DATA = 3;
    int SHOW_ALL_DATA = 4;
    int END_PROGRAM = 5;

    String YES = "y";
    String NO = "n";
}