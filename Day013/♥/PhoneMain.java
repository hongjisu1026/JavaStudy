import java.util.Scanner;

class PhoneMain {
    public static void main(String[] args) {
        while (true) {
            Manager manager = new Manager(100);

            Scanner sc = new Scanner(System.in, "EUC-KR");

            System.out.println("-----전화번호부-----");
            System.out.println("0. 전화번호부 용량보기");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 모든 데이터 보기");
            System.out.println("5. 프로그램 종료");
            System.out.print("-----번호 선택 : ");

            int selectNum = sc.nextInt();

            if (selectNum == 5) break;

            String name;
            String phone;
            String birth;
            Boolean resultFlag;

            switch(selectNum) {
                case 0:
                    System.out.println();
                    manager.manageInfo();

                    break;
                case 1:
                    System.out.println();
                    System.out.println("데이터 입력 메뉴입니다.");
                    System.out.print("* 이름: ");
                    name = sc.nextLine();

                    System.out.print("* 전화번호: ");
                    phone = sc.nextLine();

                    System.out.print("* 생년월일: ");
                    birth = sc.nextLine();

                    resultFlag = manager.savePhoneInfo(new PhoneInfo(name, phone, birth));

                    if (resultFlag) {
                        System.out.println("데이터 입력이 완료되었습니다.");
                    } else {
                        System.out.println("데이터를 저장 할 용량이 부족합니다.");
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println();
                    System.out.println("데이터 검색 메뉴입니다.");
                    System.out.print("* 이름: ");
                    name = sc.nextLine();

                    PhoneInfo searchData = manager.searchPhoneInfo(name);

                    if (searchData != null) {
                        System.out.println("* 전화번호: " + searchData.getPhone());
                        System.out.println("* 생년월일: " + searchData.getBirth());
                    } else {
                        System.out.println("데이터가 없습니다");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("데이터 삭제 메뉴입니다.");
                    System.out.print("* 이름: ");
                    name = sc.nextLine();

                    resultFlag = manager.deletePhoneInfo(name);

                    if (resultFlag) {
                        System.out.println("데이터 삭제가 완료되었습니다.");
                    } else {
                        System.out.println("데이터가 없습니다");
                    }
                    break;
                case 4:
                    System.out.println();
                    PhoneInfo[] showData = manager.showPhoneInfo();

                    for (PhoneInfo row : showData) {
                        System.out.println("이름: " + row.getName() + " 전화번호: " + row.getPhone() + "생년월일: " + row.getBirth());
                    }
                    break;
            }
        }
    }
}

class PhoneInfo {

    private String name;
    private String phone;
    private String birth;

    public PhoneInfo(String name, String phone, String birth) {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }
    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getBirth() {
        return this.birth;
    }
}

class Manager {

    private PhoneInfo[] phoneInfoArray;
    private int row;

    public Manager(int row) {
        this.row = row;
        this.phoneInfoArray = new PhoneInfo[row];
    }

    public void manageInfo() {
        System.out.print(phoneInfoArray.toString());
        System.out.print("총 " + this.row + "개 중에 " + this.getPhoneInfoLength() + "개 입력되었습니다.");
    }

    public Boolean savePhoneInfo(PhoneInfo phoneInfo) {
        int index = this.getPhoneInfoLength();

        if (index == 100) return false;

        this.phoneInfoArray[index] = phoneInfo;

        return true;
    }

    public PhoneInfo searchPhoneInfo(String name) {
        PhoneInfo phoneInfo = null;

        for (PhoneInfo row : this.phoneInfoArray) {
            if (row.getName().equals(name)) {
                phoneInfo = row;
                break;
            }
        }
        return phoneInfo;
    }

    public Boolean deletePhoneInfo(String name) {
        Boolean returnFlag = false;
        int deleteIndex = -1;

        for (int i = 0; i < this.getPhoneInfoLength(); i++) {
            if (this.phoneInfoArray[i].getName().equals(name)) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex != -1) {
            for (int i = deleteIndex; i < this.getPhoneInfoLength() - 1; i++) {
                this.phoneInfoArray[i] = this.phoneInfoArray[i + 1];
            }
            returnFlag = true;
        }
        return returnFlag;
    }

    public PhoneInfo[] showPhoneInfo() {
        return this.phoneInfoArray;
    }

    private int getPhoneInfoLength() {
        return phoneInfoArray.length;
    }
}