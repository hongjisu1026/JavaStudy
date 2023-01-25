import java.util.Arrays;
import java.util.Scanner;

class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        int len = String.valueOf(num).length();

        System.out.printf("%d는 %d자리 숫자입니다.", num, len);
    }
}

class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = sc.nextInt();
        int len = String.valueOf(num).length();
        int[] numArr = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            numArr[i] = num % 10;
            num /= 10;
        }

        System.out.println(Arrays.toString(numArr));
    }
}

class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색할 숫자를 입력하세요.");
        int search = sc.nextInt();

        boolean result = binarySearch(search);
        if (!result) {
            System.out.println("검색결과가 없습니다.");
        }
    }

    public static boolean binarySearch(int search) {
        int[] num = {1, 3, 4, 5, 7, 10, 27, 39, 50, 92};
        int start = 0;
        int end = num.length - 1;
        int mid;
        int count = 0;

        while (start <= end) {
            count++;
            mid = (start + end) / 2;
            if (num[mid] > search) {
                end = mid - 1;
            } else if (num[mid] < search) {
                start = mid + 1;
            } else if (num[mid] == search) {
                System.out.println("count : " + count);
                System.out.println("index : " + mid);
                return true;
            }
        }
        return false;
    }
}
