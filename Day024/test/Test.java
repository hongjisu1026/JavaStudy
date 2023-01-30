import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");

        sb.append("45678");
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.replace(0, 2, "AB");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.substring(2, 4));

    }
}

class Test2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        sb.append("45678");

        sb.delete(0, 5);
        System.out.println(sb);
    }
}

abstract class Friend {
    String name;
    String phoneNum;
    String addr;

    public Friend(String name, String phone, String addr) {
        this.name = name;
        this.phoneNum = phone;
        this.addr = addr;
    }

    public void showData() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
        System.out.println("주소 : " + addr);
    }

    public void showBasicInfo() {
    }
}

class HighFriend extends Friend {
    String work;

    public HighFriend(String name, String phone, String addr, String job) {
        super(name, phone, addr);
        work = job;
    }

    public void showData() {
        super.showData();
        System.out.println("직업 : " + work);
    }

    public void showBasicInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
    }
}

class UnivFriend extends Friend {
    String major;        // 전공학과

    public UnivFriend(String name, String phone, String addr, String major) {
        super(name, phone, addr);
        this.major = major;
    }

    public void showData() {
        super.showData();
        System.out.println("전공 : " + major);
    }

    public void showBasicInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNum);
        System.out.println("전공 : " + major);
    }
}

class FriendInfoHandler {
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num) {
        myFriends = new Friend[num];
        numOfFriends = 0;
    }

    private void addFriendInfo(Friend fren) {
        myFriends[numOfFriends++] = fren;
    }

    public void addFriend(int choice) {
        String name, phoneNum, addr, job, major;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("전화 : ");
        phoneNum = sc.nextLine();
        System.out.print("주소 : ");
        addr = sc.nextLine();

        if (choice == 1) {
            System.out.print("직업 : ");
            job = sc.nextLine();
            addFriendInfo(new HighFriend(name, phoneNum, addr, job));
        } else    // if(choice==2)
        {
            System.out.print("학과 : ");
            major = sc.nextLine();
            addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
        }
        System.out.println("입력 완료! \n");
    }

    public void showAllData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showData();
            System.out.println("");
        }
    }

    public void showAllSimpleData() {
        for (int i = 0; i < numOfFriends; i++) {
            myFriends[i].showBasicInfo();
            System.out.println("");
        }
    }
}

class MyFriendInfoBook {
    public static void main(String[] args) {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while (true) {
            System.out.println("*** 메뉴 선택 ***");
            System.out.println("1. 고교 정보 저장");
            System.out.println("2. 대학 친구 저장");
            System.out.println("3. 전체 정보 출력");
            System.out.println("4. 기본 정보 출력");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택>> ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    handler.addFriend(choice);
                    break;
                case 3:
                    handler.showAllData();
                    break;
                case 4:
                    handler.showAllSimpleData();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}

interface PersonalNumberStorage {
    void addPersonalInfo(String perNum, String name);

    String searchName(String perNum);
}

class PersonalNumInfo {
    String name;
    String number;

    PersonalNumInfo(String name, String number) {
        this.name = name;
        this.number = number;
    }

    String getName() {
        return name;
    }

    String getNumber() {
        return number;
    }
}

class PersonalNumberStorageImpl implements PersonalNumberStorage {
    PersonalNumInfo[] perArr;
    int numOfPerInfo;

    public PersonalNumberStorageImpl(int sz) {
        perArr = new PersonalNumInfo[sz];
        numOfPerInfo = 0;
    }

    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
        numOfPerInfo++;
    }

    public String searchName(String perNum) {
        for (int i = 0; i < numOfPerInfo; i++) {
            if (perNum.compareTo(perArr[i].getNumber()) == 0)
                return perArr[i].getName();
        }
        return null;
    }
}


class AbstractInterface {
    public static void main(String[] args) {
        PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
        storage.addPersonalInfo("김기동", "950000-1122333");
        storage.addPersonalInfo("장산길", "970000-1122334");

        System.out.println(storage.searchName("950000-1122333"));
        System.out.println(storage.searchName("970000-1122334"));
    }
}

class ClassPrinter {
    public static void print(Object o) {
        System.out.println(o.toString());
    }
}

class Point {
    private int xPos, yPos;

    Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        String posInfo = "[x:" + xPos + ", y:" + yPos + "]";
        return posInfo;
    }
}

class ImplObjectPrintln {
    public static void main(String[] args) {
        Point pos1 = new Point(1, 2);
        Point pos2 = new Point(5, 9);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
    }
}

