import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        System.out.print("문자열 입력 > ");
        String str = sc.nextLine();
        String result = "";
        boolean flag = false;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                result += morse[ch - 'a'];
                flag = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                result += morse[ch - 'A'];
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("결과 : " + result);
        } else System.out.println("영문자만 가능합니다");
    }
}

class Test2 {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("usage : java Test2 NUM1 OP NUM2");
            System.exit(0);
        }
        int result = 0;
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        String sign = args[1];

        if(sign.equals("+")) {
            result = num1 + num2;
        } else if(sign.equals("-")) {
            result = num1 - num2;
        } else if(sign.equals("x")) {
            result = num1 * num2;
        } else if(sign.equals("/")) {
            result = num1 / num2;
        }

        System.out.println("결과 : " + result);
    }
}

class Test3 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int[][] result = new int[score.length][score[0].length + 2];

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                result[i][score[i].length] += result[i][j];
                result[i][score[i].length + 1] = result[i][score[i].length] / 3;
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length-1; j++) {
                System.out.print(result[i][j] + "\t");
            }
            double avg = result[i][result[i].length-1];
            System.out.println(avg);
        }

    }
}

class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[][] shipBoard = {
                //  1  2  3  4  5  6  7  8  9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };


    }
}