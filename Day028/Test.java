import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Point {
    int xPos, yPos;

    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
    }

    @Override
    public boolean equals(Object obj) {
        Point cpy = (Point) obj;
        return xPos == cpy.xPos && yPos == cpy.yPos;
    }
}

class Rectangle {
    Point upperLeft, lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public void showPosition() {
        System.out.println("직사각형 위치정보...");
        System.out.print("좌 상단 : ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.print("우 하단 : ");
        lowerRight.showPosition();
        System.out.println("\n");
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle cpy = (Rectangle) obj;

        return upperLeft.equals(cpy.upperLeft) && lowerRight.equals(cpy.lowerRight);
    }
}

class Test1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 2, 3, 4);
        Rectangle r2 = new Rectangle(5, 6, 7, 8);
        Rectangle r3 = new Rectangle(1, 2, 3, 4);

        if (r1.equals(r2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (r1.equals(r3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

class Business implements Cloneable {
    private String company;
    private String work;

    public Business(String company, String work) {
        this.company = company;
        this.work = work;
    }

    public void showBusinessInfo() {
        System.out.println("회사 : " + company);
        System.out.println("업무 : " + work);
    }

    public void changeWork(String work) {
        this.work = work;
    }

    @Override
    protected Business clone() throws CloneNotSupportedException {
        return (Business) super.clone();
    }
}

class PersonalInfo implements Cloneable {
    private String name;
    private int age;
    private Business bness;

    public PersonalInfo(String name, int age, String company, String work) {
        this.name = name;
        this.age = age;
        bness = new Business(company, work);
    }

    public void showPersonalInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        bness.showBusinessInfo();
        System.out.println("");
    }

    public void changeWork(String work) {
        bness.changeWork(work);
    }

    @Override
    protected PersonalInfo clone() throws CloneNotSupportedException {
        PersonalInfo cpy = (PersonalInfo) super.clone();
        cpy.bness = bness.clone();
        return cpy;
    }
}

class DeepCopyImpl {
    public static void main(String[] args) throws CloneNotSupportedException {

        PersonalInfo pInfo = new PersonalInfo("James", 22, "HiMedia", "encoding");
        PersonalInfo pCopy = pInfo.clone();
        pCopy.changeWork("decoding");

        pInfo.showPersonalInfo();
        pCopy.showPersonalInfo();
    }
}

class Test3 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();

        for (int i = 0; i < phoneNumArr.length; i++) {
            String temp = phoneNumArr[i].replaceAll("-", "");
            if (temp.contains(search)) {
                System.out.println(phoneNumArr[i]);
            }
        }
    }
}

class Test4 {
    public static void main(String[] args) {
        char[] dest = new char[10];
        char[] src = {'1', '2', '3', '4'};

        Arrays.fill(dest, '0');

        System.out.println("왼쪽 정렬");
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println(dest);

        Arrays.fill(dest, '0');

        System.out.println("오른쪽 정렬");
        System.arraycopy(src, 0, dest, dest.length - src.length, src.length);
        System.out.println(dest);

        Arrays.fill(dest, '0');

        System.out.println("가운데 정렬");
        System.arraycopy(src, 0, dest, (dest.length - src.length) / 2, src.length);
        System.out.println(dest);
    }
}

/*
test 5.
1
3
5
1
5
6

test 6.
3
5

test 7.
1
 */

class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("숫자 입력 >> ");
            int num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE = 100;

    public UnsupportedFunctionException(String message, int errorCode) {
        super(message);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + ERR_CODE + "]" + super.getMessage();
    }
}

/*
2
4
7
 */