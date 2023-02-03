import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BookTest1 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1.equals(c2):" + c1.equals(c2));
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object obj) {
        SutdaCard cpy = (SutdaCard) obj;
        return num == cpy.num && isKwang == cpy.isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class BookTest2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?" + (p1 == p2));
        System.out.println("p1.equals(p2)?" + (p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0, 0, 0);
    }

    @Override
    public boolean equals(Object obj) {
        Point3D cpy = (Point3D) obj;
        return x == cpy.x && y == cpy.y && z == cpy.z;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + ", " + z + "]";
    }
}

class BookTest3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        path = fullPath.substring(0, 14);
        fileName = fullPath.substring(15);

        System.out.println("fullPath : " + fullPath);
        System.out.println("path : " + path);
        System.out.println("fileName : " + fileName);
    }
}

class BookTest4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int i = 0; i < dataArr.length; i++) {
            for (int j = 0; j < dataArr[i]; j++) {
                System.out.print(ch);
            }
            System.out.println(dataArr[i]);
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}

class BookTest5 {
    public static int count(String src, String target) {
        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치

        while (true) {
            pos = src.indexOf(target, pos);
            if (pos == -1) break;
            if (src.substring(pos).contains(target)) {
                count++;
                pos += target.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }
}

class BookTest6 {
    public static String fillZero(String src, int length) {
        if (src == null || src.length() == length) {
            return src;
        } else if (length <= 0) {
            return "";
        } else if (src.length() > length) {
            return src.substring(0, length);
        }
        char[] arr = new char[length];
        Arrays.fill(arr, '0');
        System.arraycopy(src.toCharArray(), 0, arr, length - src.length(), src.length());
        return new String(arr);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src, 10));
        System.out.println(fillZero(src, -1));
        System.out.println(fillZero(src, 3));
    }
}

class BookTest7 {
    public static boolean contains(String src, String target) {
        return src.indexOf(target) != -1;
    }

    public static void main(String[] args) {
        System.out.println(contains("12345", "23"));
        System.out.println(contains("12345", "67"));
    }
}

class BookTest8 {
    public static double round(double d, int n) {
        double num = Math.pow(10.0, n);
        return Math.round(d * num) / num;
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }
}

class BookTest9 {
    public static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (delCh.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> "

                + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));

        System.out.println("(1 2 3 4\t5)" + " -> "

                + delChar("(1 2 3 4\t5)", " \t"));

    }
}

class BookTest10 {
    public static String format(String str, int length, int alignment) {
        String result = "";
        if (length < str.length()) {
            return str.substring(length);
        } else {
            char[] arr = new char[length];
            char[] sArr = str.toCharArray();
            Arrays.fill(arr, ' ');
            switch (alignment) {
                case 0:
                    System.arraycopy(sArr, 0, arr, 0, str.length());
                    break;
                case 1:
                    System.arraycopy(sArr, 0, arr, (arr.length - str.length()) / 2, str.length());
                    break;
                case 2:
                    System.arraycopy(sArr, 0, arr, arr.length - str.length(), str.length());
            }
            for (int i = 0; i < arr.length; i++) {
                result += arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str, 7, 0)); // 왼쪽 정렬
        System.out.println(format(str, 7, 1)); // 가운데 정렬
        System.out.println(format(str, 7, 2)); // 오른쪽 정렬
    }
}

class BookTest11 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
            System.out.println("USAGE : GugudanTest 3 5");
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int mul = 1;

            if (num1 < 2 || num1 > 9 || num2 < 2 || num2 > 9) {
                System.out.println("단위의 범위는 2와 9사이의 값이어야 합니다.");
                System.out.println("USAGE : GugudanTest 3 5");
            } else {
                for (int i = num1; i <= num2; i++) {
                    for (int j = 1; j <= 9; j++) {
                        mul = i * j;
                        System.out.println(i + " * " + j + " = " + mul);
                    }
                    System.out.println();
                }
            }
        }
    }
}

class BookTest12 {
    public static int getRand(int from, int to) {
        return (int) (Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++)
            System.out.print(getRand(1, -3) + ",");
    }
}

class BookTest13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
    }

    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }

    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;
        if (key == null || key.length() == 0)
            return 0;


        while ((index = src.indexOf(key, pos)) != -1) {
            count++;
            pos = index + key.length();
        }

        return count;
    }
}

class BookTest14 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };
        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print(">>");
            String input = s.nextLine().trim();
            if (input.equals("")) {
                continue;
            } else if (input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            String pattern = ".*" + input + ".*";
            Pattern p = Pattern.compile(pattern);

            for(int i = 0; i < phoneNumArr.length; i++) {
                String phone = phoneNumArr[i];
                String temp = phone.replaceAll("-", "");

                Matcher m = p.matcher(temp);

                if(m.find()) {
                    list.add(phone);
                }
            }
            if (list.size() > 0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다.");
            }
        }
    } // main
}