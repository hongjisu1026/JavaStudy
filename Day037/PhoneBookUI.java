import java.util.Scanner;

public class PhoneBookUI {
    private PhoneBookUI() {
    }

    public static Scanner sc = new Scanner(System.in);
    private static PhoneBook pb = new PhoneBook();

    public static void showMenu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 >> ");
    }

    public static void choiceMenu() {
        showMenu();
        int choice = sc.nextInt();
        sc.nextLine();
        try {
            switch (choice) {
                case MenuString.SAVE_DATA:
                    saveDataUI();
                    break;
                case MenuString.SEARCH_DATA:
                    searchDataUI();
                    break;
                case MenuString.DELETE_DATA:
                    deleteDataUI();
                    break;
                case MenuString.SHOW_ALL_DATA:
                    showAllDataUI();
                    break;
                case MenuString.END_PROGRAM:
                    endProgramUI();
                    break;
                default:
                    throw new MenuChoiceException(choice);
            }
        } catch (MenuChoiceException e) {
            e.showWrongMenu();
        }
    }

    public static int showSaveMenu() {
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static void saveDataUI() {
        System.out.println("데이터 입력을 시작합니다.");
        int choice = showSaveMenu();
        try {
            switch (choice) {
                case MenuString.GENERAL:
                    saveGeneralDataUI();
                    break;
                case MenuString.UNIV:
                    saveUnivDataUI();
                    break;
                case MenuString.COMPANY:
                    saveCompanyDataUI();
                    break;
                default:
                    throw new MenuChoiceException(choice);
            }
        } catch (MenuChoiceException e) {
            e.showWrongMenu();
        }
    }

    public static void saveGeneralDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        boolean flag = pb.saveGeneralData(name, phone);
        if (flag) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 저장 실패!");
            System.out.println("이미 존재하는 전화번호입니다.");
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
        boolean flag = pb.saveUnivData(name, phone, major, year);
        if (flag) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 저장 실패!");
            System.out.println("이미 존재하는 전화번호입니다.");
        }
    }

    public static void saveCompanyDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("회사 : ");
        String company = sc.nextLine();
        boolean flag = pb.saveCompanyData(name, phone, company);
        if (flag) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 저장 실패!");
            System.out.println("이미 존재하는 전화번호입니다.");
        }
    }

    public static void searchDataUI() {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("검색할 전화번호를 입력하세요. >> ");
        String phone = sc.nextLine();
        boolean flag = pb.searchData(phone);

        if (flag) {
            System.out.println("데이터 검색이 완료되었습니다.");
        } else {
            System.out.println("존재하지 않는 데이터입니다.");
        }
    }

    public static void deleteDataUI() {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("삭제할 전화번호를 입력하세요. >> ");
        String phone = sc.nextLine();
        boolean searchFlag = pb.searchData(phone);

        if(searchFlag) {
            System.out.println("정말로 삭제하시겠습니까? (1. Yes, 2. No) >> ");
            int answer = sc.nextInt();
            try {
                switch (answer) {
                    case MenuString.YES:
                        pb.deleteData(phone);
                        System.out.println("데이터 삭제가 완료되었습니다.");
                        break;
                    case MenuString.NO:
                        System.out.println("취소되었습니다.");
                        return;
                    default:
                        throw new MenuChoiceException(answer);
                }
            } catch (MenuChoiceException e) {
                e.showWrongMenu();
            }
        } else {
            System.out.println("존재하지 않는 전화번호입니다.");
        }
    }

    public static void showAllDataUI() {
        System.out.println("모든 데이터 출력을 시작합니다.");
        boolean flag = pb.showAllData();

        if(flag) {
            System.out.println("모든 데이터 출력이 완료되었습니다.");
        } else {
            System.out.println("입력된 데이터가 없습니다.");
        }
    }

    public static void endProgramUI() {
        System.out.print("정말로 프로그램을 종료하시겠습니까? (1. Yes, 2. No) >> ");
        int answer = sc.nextInt();
        try {
            switch (answer) {
                case MenuString.YES:
                    pb.endProgram();
                    break;
                case MenuString.NO:
                    return;
                default:
                    throw new MenuChoiceException(answer);
            }
        } catch (MenuChoiceException e) {
            e.showWrongMenu();
        }
    }
}
