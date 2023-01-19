class Test1 {
    public static void main(String[] args) {
        int num = 10;
        String temp = String.valueOf(num);
        System.out.println(temp);
    }
}

class Test2 {
    public static void main(String[] args) {
        String numStr = "20";
        int temp = Integer.parseInt(numStr);
        System.out.println(temp);
    }
}

class Test3 {
    public static void main(String[] args) {
        String str = "0123456789";
        String temp = str.substring(3);
        System.out.println(temp);
    }
}

class Test4 {
    public static void main(String[] args) {
        String str = "0123456789";
        String temp = str.substring(4, 7);
        System.out.println(temp);
    }
}

class Test5 {
    public static void main(String[] args) {
        double num1 = 3.5;
        double num2 = 3.1;

        System.out.println(Math.round(num1));
        System.out.println(Math.floor(num1));
        System.out.println(Math.ceil(num2));
    }
}

class Test6 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int e: arr) {
            sum += e;
        }
        System.out.println(sum);
    }
}

class Test7 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int sum = 0;

        for(int[] e: arr) {
            for(int f: e) {
                sum += f;
            }
        }

        System.out.println(sum);
    }
}
