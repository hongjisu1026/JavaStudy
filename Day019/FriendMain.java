import java.util.Scanner;

class FriendMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "EUC-KR");
        final int HIGH_FRIEND = 1;
        final int UNIV_FRIEND = 2;
        final int SHOW_DATA = 3;
        final int SHOW_BASIC_DATA = 4;
        final int END_PROGRAM = 5;

        Friend[] arr = new Friend[100];

        int count = 0;

        while (true) {
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 고교 정보 저장");
            System.out.println("2. 대학 친구 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 전체 기본 정보 출력");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택 >> ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (choice) {
                case HIGH_FRIEND:
                    System.out.print("이름 입력 : ");
                    String hName = sc.nextLine();
                    System.out.print("전화번호 입력 : ");
                    String hPhone = sc.nextLine();
                    System.out.print("주소 입력 : ");
                    String hAddress = sc.nextLine();
                    System.out.print("직장 입력 : ");
                    String hCompany = sc.nextLine();
                    if (count < 100) {
                        arr[count++] = new HighFriend(hName, hPhone, hAddress, hCompany);
                    }
                    System.out.println("저장 완료");
                    break;
                case UNIV_FRIEND:
                    System.out.print("이름 입력 : ");
                    String uName = sc.nextLine();
                    System.out.print("전화번호 입력 : ");
                    String uPhone = sc.nextLine();
                    System.out.print("주소 입력 : ");
                    String uAddress = sc.nextLine();
                    System.out.print("전공 입력 : ");
                    String uMajor = sc.nextLine();
                    if (count < 100) {
                        arr[count++] = new UnivFriend(uName, uPhone, uAddress, uMajor);
                    }
                    System.out.println("저장 완료");
                    break;
                case SHOW_DATA:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            arr[i].showData();
                            System.out.println();
                        }
                    } else {
                        System.out.println("데이터가 존재하지 않습니다.");
                    }
                    break;
                case SHOW_BASIC_DATA:
                    if (count > 0) {
                        for (int i = 0; i < count; i++) {
                            if (arr[i] instanceof HighFriend) {
                                ((HighFriend) arr[i]).showBasicInfo();
                                System.out.println();
                            }
                            if (arr[i] instanceof UnivFriend) {
                                ((UnivFriend) arr[i]).showBasicInfo();
                                System.out.println();
                            }
                        }
                    } else {
                        System.out.println("데이터가 존재하지 않습니다.");
                    }
                    break;
                case END_PROGRAM:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}

class Friend {
    private String name, phone, address;

    Friend(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void showData() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
        System.out.println("주소 : " + address);
    }

    public void showBasicInfoName() {
        System.out.println("이름 : " + name);
    }

    public void showBasicInfoPhone() {
        System.out.println("전화번호 : " + phone);
    }

    public void showBasicInfoAddress() {
        System.out.println("주소 : " + address);
    }
}

class HighFriend extends Friend {
    private String company;

    HighFriend(String name, String phone, String address, String company) {
        super(name, phone, address);
        this.company = company;
    }

    public void showData() {
        super.showData();
        System.out.println("직장 : " + company);
    }

    public void showBasicInfo() {
        super.showBasicInfoName();
        super.showBasicInfoPhone();
        System.out.println("직장 : " + company);
    }
}

class UnivFriend extends Friend {
    private String major;

    UnivFriend(String name, String phone, String address, String major) {
        super(name, phone, address);
        this.major = major;
    }

    public void showData() {
        super.showData();
        System.out.println("전공 : " + major);
    }

    public void showBasicInfo() {
        super.showBasicInfoName();
        System.out.println("전공 : " + major);
    }
}