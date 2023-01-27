package com.phoneBook;

import java.util.Scanner;

public class PhoneBookUI implements PhoneBookString {
    public static Scanner sc = new Scanner(System.in);
    private static PhoneBook pb = new PhoneBook();

    private PhoneBookUI() {
    }

    public static void showMenu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 >> ");

        try {
            int menu = sc.nextInt();
            sc.nextLine();

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
                default:
                    throw new MenuChoiceException(menu);
            }
        } catch (MenuChoiceException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showSaveMenu() throws MenuChoiceException {
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >> ");
        int saveMenu = sc.nextInt();
        sc.nextLine();

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
                throw new MenuChoiceException(saveMenu);
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
            System.out.println("데이터 용량이 가득찼습니다.");
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

        boolean result = pb.saveData(new PhoneUnivInfo(name, phone, major, year));
        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 용량이 가득찼습니다.");
        }
    }

    public static void saveCompanyDataUI() {
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("회사 : ");
        String company = sc.nextLine();

        boolean result = pb.saveData(new PhoneCompanyInfo(name, phone, company));
        if (result) {
            System.out.println("데이터 입력이 완료되었습니다.");
        } else {
            System.out.println("데이터 용량이 가득찼습니다.");
        }
    }

    public static void searchDataUI() {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("검색할 이름을 입력하세요 >> ");
        String name = sc.nextLine();

        boolean result = pb.searchData(name);
        if (result) {
            System.out.println("데이터 검색이 완료되었습니다.");
        } else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }

    public static void deleteDataUI() {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("삭제할 이름을 입력하세요 >> ");
        String name = sc.nextLine();
        int index = pb.binarySearch(name);
        if (index != -1) {
            System.out.println("정말로 삭제하시겠습니까? (Y / N)");
            String deleteYN = sc.nextLine().toLowerCase();

            switch (deleteYN) {
                case YES:
                    pb.deleteData(index);
                    System.out.println("데이터 삭제가 완료되었습니다.");
                    break;
                case NO:
                    System.out.println("취소되었습니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        } else {
            System.out.println("존재하지 않는 이름입니다.");
        }
    }

    public static void showAllDataUI() {
        System.out.println("모든 데이터를 출력합니다.");
        boolean result = pb.showAllData();
        if (!result) {
            System.out.println("데이터가 존재하지 않습니다.");
        }
    }

    public static void endProgramUI() {
        System.out.println("프로그램을 종료합니다.");
        pb.endProgram();
    }
}