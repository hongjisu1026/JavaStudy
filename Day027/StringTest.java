import java.util.Arrays;
import java.util.Scanner;

class StringTest1 {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        String search = sc.nextLine();

        for (int i = 0; i < phoneNumArr.length; i++) {
            String temp = phoneNumArr[i];
            temp = temp.replaceAll("-", "");
            if (temp.contains(search)) {
                System.out.println(phoneNumArr[i]);
            }

        }
    }
}

class StringTest2 {
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