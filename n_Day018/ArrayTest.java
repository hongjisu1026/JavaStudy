import java.util.Random;
import java.util.Scanner;

class ArrayTest1 {
    public static void main(String[] args) {
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."};
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요.");
        String str = sc.nextLine();

        String result = "";
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += morse[ch - 'a'];
            } else if (ch >= 'A' && ch <= 'Z') {
                result += morse[ch - 'A'];
            } else {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(result);
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }
}

class ArrayTest2 {
    public static void main(String[] args) {
        int result = 0;
        for (String e : args) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            if (args[1].equals("+")) {
                result = num1 + num2;
            } else if (args[1].equals("-")) {
                result = num1 - num2;
            } else if (args[1].equals("x")) {
                result = num1 * num2;
            } else if (args[1].equals("/")) {
                result = num1 / num2;
            }
        }
        System.out.println("결과 : " + result);
    }
}

class ArrayTest3 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };

        int[][] result = new int[score.length][score[0].length + 2];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                result[i][score[0].length] += result[i][j];
                result[i][score[0].length + 1] = result[i][score[0].length] / 3;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length - 1; j++) {
                System.out.print(result[i][j] + "\t");
            }
            double avg = result[i][4];
            System.out.println(avg);
        }
    }
}

class ArrayTest4 {
    public static void main(String[] args) {
        byte[][] shipBoard = {
                //  1  2  3  4  5  6  7  8  9
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 1
                {1, 1, 1, 1, 0, 0, 1, 0, 0}, // 2
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 3
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // 4
                {0, 0, 0, 0, 0, 0, 0, 0, 0}, // 5
                {1, 1, 0, 1, 0, 0, 0, 0, 0}, // 6
                {0, 0, 0, 1, 0, 0, 0, 0, 0}, // 7
                {0, 0, 0, 1, 0, 0, 0, 0, 0}, // 8
                {0, 0, 0, 0, 0, 1, 1, 1, 0}, // 9
        };
        char[][] arr = new char[shipBoard.length][shipBoard[0].length];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("좌표를 입력해주세요. (종료는 00) > ");
            int num = sc.nextInt();

            int num1 = num / 10;
            int num2 = num % 10;

            if (num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
                if (shipBoard[num1][num2] == 1) {
                    arr[num1 - 1][num2 - 1] = 'O';
                } else {
                    arr[num1 - 1][num2 - 1] = 'X';
                }
                System.out.println(" 123456789");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(i + 1);
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j]);
                    }
                    System.out.println();
                }
            } else if (num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}

class ArrayTest5 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[] rArr = randomNumber();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rArr[i * 5 + j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        while (true) {
            System.out.print("1~25의 숫자를 입력하세요. (종료 : 0) > ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 25) {
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        if (arr[i][j] == num) {
                            arr[i][j] = 0;
                        }
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (num == 0) {
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static int[] randomNumber() {
        int count = 25;
        int r[] = new int[count];
        for (int i = 0; i < count; i++) {
            r[i] = (int) (Math.random() * count) + 1;
            for (int j = 0; j < i; j++) {
                if (r[i] == r[j]) {
                    i--;
                }
            }
        }
        return r;
    }
}

class Test {

    public static void main(String[] args) {
        int[][] numMatrix = initMatrix(5, 5);
        printArray(numMatrix);
        startGame(numMatrix);
    }

    public static int[][] initMatrix(int row, int column) {
        int[] ranNumArray = new int[row * column];
        int[][] numMatrix = new int[row][column];

        Random ran = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                boolean flag = true;
                int length = (i * row) + j + 1;
                int ranNum = ran.nextInt(row * column) + 1;

                for (int k = 0; k < length; k++) {
                    if (ranNumArray[k] == ranNum) {
                        flag = false;
                        j--;
                    }
                }

                if (flag) {
                    ranNumArray[length - 1] = ranNum;
                    numMatrix[i][j] = ranNum;
                }
            }
        }
        return numMatrix;
    }

    public static void startGame(int[][] numMatrix) {
        while (true) {
            System.out.print("1 ~ 25의 숫자를 입력하세요.(종료: 0): ");

            Scanner sc = new Scanner(System.in);
            int inputNum = sc.nextInt();

            if (inputNum == 0) return;

            if (inputNum >= 1 && inputNum <= 25) {
                for (int i = 0; i < numMatrix.length; i++) {
                    boolean flag = false;

                    for (int j = 0; j < numMatrix[i].length; j++) {
                        if (numMatrix[i][j] == inputNum) {
                            numMatrix[i][j] = 0;
                            flag = true;
                            break;
                        }
                    }

                    if (flag) break;
                }
                printArray(numMatrix);
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public static void printArray(int[][] numMatrix) {
        for (int i = 0; i < numMatrix.length; i++) {
            for (int j = 0; j < numMatrix[i].length; j++) {
                System.out.print(numMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

}