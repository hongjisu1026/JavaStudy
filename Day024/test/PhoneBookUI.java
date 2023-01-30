import java.util.Scanner;

public class PhoneBookUI implements ConstantMenu {
    private static PhoneBook pb = new PhoneBook();
    public static Scanner sc = new Scanner(System.in, "EUC-KR");

    private PhoneBookUI() {
    }

    public static void showMenu() {
        System.out.println("===== 전화번호부 =====");
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 >> ");
        int menu = sc.nextInt();
        sc.nextLine();
        try {
            choiceMenu(menu);
        } catch (MenuChoiceException e) {
            e.showWrongChoice(menu);
        }

    }

    public static void choiceMenu(int menu) throws MenuChoiceException {
        switch (menu) {
            case SAVE_DATA:
                showSaveMenu();
                break;
            case SEARCH_DATA:
                searchDataUI();
                break;
            case DELETE_DATA:
                deleteDataUI();
                break;
            case SHOW_ALL_DATA:
                showAllDataUI();
                break;
            case END_PROGRAM:
                endProgramUI();
                break;
            default:
                throw new MenuChoiceException();
        }
    }

    public static void showSaveMenu() throws MenuChoiceException {
        System.out.println("=====데이터 입력=====");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int saveMenu = sc.nextInt();
        sc.nextLine();

        choiceSaveMenu(saveMenu);
    }

    public static void choiceSaveMenu(int saveMenu) throws MenuChoiceException {
        switch (saveMenu) {
            case COMMON:
                saveCommonDataUI();
                break;
            case UNIV:
                saveUnivDataUI();
                break;
            case COMPANY:
                saveCompanyDataUI();
                break;
            default:
                throw new MenuChoiceException();
        }
    }

    public static void saveCommonDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        boolean result = pb.saveData(new PhoneInfo(name, phone));

        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("저장 공간이 부족합니다.");
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
        boolean result = pb.saveData(new UnivPhoneInfo(name, phone, major, year));

        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("저장 공간이 부족합니다.");
        }
    }

    public static void saveCompanyDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("회사 : ");
        String company = sc.nextLine();
        boolean result = pb.saveData(new CompanyPhoneInfo(name, phone, company));

        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("저장 공간이 부족합니다.");
        }
    }

    public static void searchDataUI() {
        System.out.println("=====데이터 검색=====");
        System.out.print("검색할 이름을 입력하세요 >> ");
        String name = sc.nextLine();

        boolean result = pb.searchData(name);
        if (result) {
            System.out.println("데이터 검색이 완료되었습니다.");
        } else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }

    public static void deleteDataUI() throws MenuChoiceException {
        System.out.println("=====데이터 삭제=====");
        System.out.print("삭제할 이름을 입력하세요 >> ");
        String name = sc.nextLine();
        int index = pb.searchName(name);


        if (index != -1) {
            System.out.print("정말로 삭제하시겠습니까? (Y / N)");
            String deleteMenu = sc.nextLine().toLowerCase();
            try {
                switch (deleteMenu) {
                    case YES:
                        boolean result = pb.deleteData(index);
                        if (result) {
                            System.out.println("데이터 삭제가 완료되었습니다.");
                        }
                        break;
                    case NO:
                        System.out.println("취소되었습니다.");
                        break;
                    default:
                        throw new MenuChoiceException();
                }
            } catch (MenuChoiceException e) {
                e.showWrongDeleteMenuChoice(deleteMenu);
            }
        } else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }

    public static void showAllDataUI() {
        System.out.println("=====모든 데이터 보기=====");
        pb.showAllData();
    }

    public static void endProgramUI() {
        System.out.println("=====프로그램 종료=====");
        System.out.println("프로그램을 종료합니다.");
        pb.endProgram();
    }
}
