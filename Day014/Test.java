import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int[] e : arr) {
            for (int f : e) {
                System.out.print(f + "\t");
            }
            System.out.println();
        }
    }
}

/*
문제 2번
static { }
BlockTest bt = new BlockTest();
{ }
생성자
BlockTest bt2 = new BlockTest();
{ }
생성자
*/

/*
문제 3번
cv=0 -> cv=1 -> cv=2 -> iv=0 -> iv=1 -> iv=2-> iv=3
*/

class Test4 {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}

class PhoneMain {
    public static void main(String[] args) {
        final int SAVE_DATA = 1;
        final int FIND_DATA = 2;
        final int DELETE_DATA = 3;
        final int SHOW_ALL_DATA = 4;
        final int END_PROGRAM = 5;
        Manager m = new Manager();

        while (true) {
            Scanner sc = new Scanner(System.in, "EUC-KR");
            System.out.println("선택하세요...");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 모든 데이터 보기");
            System.out.println("5. 프로그램 종료");



            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case SAVE_DATA:
                    m.saveData();
                    break;
                case FIND_DATA:
                    m.findData();
                    break;
                case DELETE_DATA:
                    m.deleteData();
                    break;
                case SHOW_ALL_DATA:
                    m.showData();
                    break;
                case END_PROGRAM:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    System.out.println();
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

    public String getName() {
        return name;
    }

    public void showPhoneInfo() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("birth : " + birth);
    }
}

class Manager {
    PhoneInfo[] pArr = new PhoneInfo[100];
    Scanner sc = new Scanner(System.in, "EUC-KR");
    PhoneInfo info = null;
    private boolean flag = false;
    private int count = 0;
    private int temp = 0;
    private String name, phone, birth;

    public void saveData() {
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("전화번호 : ");
        phone = sc.nextLine();
        System.out.print("생년월일 : ");
        birth = sc.nextLine();
        info = new PhoneInfo(name, phone, birth);
        pArr[count++] = info;
        System.out.println("데이터 입력이 완료되었습니다.");
        System.out.println();
    }

    public void findData() {
        System.out.println("검색하시고자 하는 이름을 입력하세요.");
        name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (name.equals(pArr[i].getName())) {
                pArr[i].showPhoneInfo();
                flag = true;
                System.out.println();
            }
        }
        if (!flag) {
            System.out.println("검색하시고자 하는 사람이 없습니다.");
            System.out.println();
        }
        flag = false;
    }

    public void deleteData() {
        System.out.println("삭제하시고자 하는 이름을 입력하세요.");
        name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (name.compareTo(pArr[i].getName()) == 0) {
                temp = i;
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("삭제하시고자 하는 사람이 없습니다.");
            System.out.println();
        }
        else {
            for (int i = temp; i < count - 1; i++)
                pArr[i] =pArr[i + 1];
            pArr[count - 1] = null;
            count--;
            flag = false;
            System.out.println("삭제가 완료되었습니다.");
            System.out.println();
        }
    }

    public void showData() {
        for (int i = 0; i < count; i++) {
            if (count != 0) {
                pArr[i].showPhoneInfo();
                System.out.println();
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("저장된 데이터가 없습니다.");
            System.out.println();
        }
        flag = false;
    }

}