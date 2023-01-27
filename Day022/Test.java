class Test2 {
    public static void main(String[] args) {
        System.out.println(add(5));
        System.out.println(add(5, 10));
        System.out.println(add(5, 10, 15));
    }

    public static int add(int... num) {
        int sum = 0;
        for (int e : num) {
            sum += e;
        }
        return sum;
    }
    /*
    public static int add(int num1) {
        return num1;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    */
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
    public static void print(Object obj) {
        if (obj instanceof UpperCasePrintable) {
            System.out.println(obj.toString().toUpperCase());
        } else {
            System.out.println(obj.toString());
        }
    }
}

interface UpperCasePrintable {
}

class Point1 implements UpperCasePrintable {
    private int xPos, yPos;

    Point1(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        String posInfo = "[x pos : " + xPos + ", y pos : " + yPos + "]";
        return posInfo;
    }
}

class Point2 {
    private int xPos, yPos;

    Point2(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        String posInfo = "[x pos : " + xPos + ", y pos : " + yPos + "]";
        return posInfo;
    }
}

class ImplObjectPrintln {
    public static void main(String[] args) {
        Point1 pos1 = new Point1(1, 1);
        Point2 pos2 = new Point2(2, 2);
        Point1 pos3 = new Point1(3, 3);
        Point2 pos4 = new Point2(4, 4);

        ClassPrinter.print(pos1);
        ClassPrinter.print(pos2);
        ClassPrinter.print(pos3);
        ClassPrinter.print(pos4);
    }
}

class Test5 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "abc";

        System.out.println(str1.equals(str2));  // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.compareTo(str2));  // -32
        System.out.println(str1.compareToIgnoreCase(str2)); // 0
    }
}