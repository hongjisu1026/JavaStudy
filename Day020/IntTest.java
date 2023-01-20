import java.util.Arrays;
import java.util.Scanner;

// 상속 연습
class IntTest1 {
    int num;

    IntTest1(int num) {
        this.num = num;
    }

    public void digits() {
        System.out.printf("%d는 %d자리 숫자입니다. \n", num, String.valueOf(num).length());
    }
}

class IntTest2 extends IntTest1 {
    IntTest2(int num) {
        super(num);
    }

    public void makeArr() {
        String temp = String.valueOf(super.num);
        int len = temp.length();
        int[] numArr = new int[len];

        for (int i = 0; i < len; i++) {
            numArr[i] = temp.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(numArr));
    }

    public void print() {
        digits();
        makeArr();
    }
}

class IntMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();

        IntTest2 i = new IntTest2(num);
        i.print();
    }
}

// 일반 풀이
class IntTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();

        IntTest intTest = new IntTest();
        intTest.digits(num);
        intTest.makeArr(num);
    }

    public void digits(int num) {
        System.out.printf("%d는 %d자리 숫자입니다. \n", num, String.valueOf(num).length());
    }

    public void makeArr(int num) {
        String temp = String.valueOf(num);
        int len = temp.length();
        int[] numArr = new int[len];

        for (int i = 0; i < len; i++) {
            numArr[i] = temp.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(numArr));
    }
}
