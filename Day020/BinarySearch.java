import java.util.Scanner;

class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력");
        int num = sc.nextInt();

        if(!searchNum(num)) {
            System.out.println("검색결과가 없습니다.");
        }
    }


    public static boolean searchNum(int search) {
        int[] num = {1, 3, 5, 7, 10, 27, 39, 50, 92};
        int left = 0;
        int right = num.length - 1;
        int mid;
        int count = 0;

        while (left <= right) {
            count++;
            mid = (left + right) / 2;
            if (num[mid] == search) {
                System.out.println("index : " + mid);
                System.out.println("count : " + count);
                return true;
            } else if (num[mid] > search) {
                right = mid - 1;
            } else if (num[mid] < search) {
                left = mid + 1;
            }
        }
        return false;
    }
}
