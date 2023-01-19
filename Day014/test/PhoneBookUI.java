package test;

import java.util.Scanner;

public class PhoneBookUI {
    private static PhoneBook pb = new PhoneBook();
    public static Scanner sc = new Scanner(System.in, "EUC-KR");

    private PhoneBookUI() {}

    public static void choiceNumber() {
        System.out.println("=====전화번호부=====");
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.println();
        System.out.print("선택 : ");
    }
    public static void saveDataUI() {
        boolean result;
        System.out.println("=====사용자 입력=====");
        System.out.println("데이터 입력을 시작합니다...");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phone = sc.nextLine();
        System.out.print("생년월일 : ");
        String birth = sc.nextLine();

        result = pb.saveData(name, phone, birth);
        if (result) {
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
        boolean result = pb.printAllData();
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
        System.out.println("잘못 입력하셨습니다.");
        System.out.println();
    }
}