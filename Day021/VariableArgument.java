// 가변인자 사용
class VariableArgument {
    public static void main(String[] args) {
        System.out.println(add(5));    // 5
        System.out.println(add(5, 10));        // 15
        System.out.println(add(5, 10, 15));    // 30
    }

    public static int add(int... num) {
        int sum = 0;
        for (int e : num) {
            sum += e;
        }
        return sum;
    }
}

// 메소드 오버로딩 사용
class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(add(5));    // 5
        System.out.println(add(5, 10));        // 15
        System.out.println(add(5, 10, 15));    // 30
    }

    public static int add(int num1) {
        return num1;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}