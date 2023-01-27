import java.util.Arrays;
import java.util.Scanner;

interface TV {
    public void onTV();
}

class TVImpl {
    public void onTV() {
        System.out.println("영상 출력 중");
    }
}

interface Computer {
    public void dataReceive();
}

class ComputerImpl {
    public void dataReceive() {
        System.out.println("영상 데이터 수신 중");
    }
}

class IPTV implements TV, Computer {
    ComputerImpl comp = new ComputerImpl();
    TVImpl tv = new TVImpl();

    public void dataReceive() {
        comp.dataReceive();
    }

    public void onTV() {
        tv.onTV();
    }

    public void powerOn() {
        dataReceive();
        onTV();
    }
}

class MultiInheriAlternative {
    public static void main(String[] args) {
        IPTV iptv = new IPTV();
        iptv.powerOn();

        TV tv = iptv;
        Computer comp = iptv;
    }
}

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("피제수 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("제수 입력 : ");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("나눗셈 결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
    }
}

/*
2.
getMessage, Throwable, Throwable
3.
- IndexOutOfBoundsException
- ClassCastException
- NegativeArraySizeException
- NullPointerException
 */

class Test4 {
    public static void main(String[] args) {
        int num = 10;
        try {
            int[] arr1 = new int[10];
            arr1[10] = num; // IndexOutOfBoundsException
            System.out.println(arr1[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException 발생");
        }

        try {
            Object o = new Object();
            System.out.println(Integer.parseInt((String) o)); // ClassCastException
        } catch (ClassCastException e) {
            System.out.println("ClassCastException 발생");
        }

        try {
            int[] arr2 = new int[-1]; // NegativeArraySizeException
            System.out.println(Arrays.toString(arr2));
        } catch (NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException 발생");
        }

        try {
            String s = null;
            System.out.println(s.toUpperCase());// NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생");
        }
    }
}

class Test5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] arr = new int[100];
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print("피제수 입력: ");
                int num1 = keyboard.nextInt();

                System.out.print("제수 입력: ");
                int num2 = keyboard.nextInt();

                System.out.print("연산결과를 저장할 배열의 인덱스 입력: ");
                int idx = keyboard.nextInt();

                arr[idx] = num1 / num2;
                System.out.println("나눗셈 결과는 " + arr[idx]);
                System.out.println("저장된 위치의 인덱스는 " + idx);
            }
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 범위를 벗어났습니다.");
        }
    }
}
/*
6.
Throwable과 ArithmeticException의 순서가 바뀌어야 한다.
 */

class Test7 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("finally는 반드시 실행");
        }
    }
}

class Test8 {
    public static void main(String[] args) throws AgeInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        if (age < 0) {
            throw new AgeInputException();
        }
    }
}

class AgeInputException extends Exception {
    public AgeInputException() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

/*
9.
throw
11.
try-catch 구문을 사용한다
12.
- getMessage() 메소드 호출
- 예외상황이 발생해서 전달되는 과정 출력
- 프로그램 종료
13.
Throwable, printStackTrace()
 */

class Test14 {
    public static void main(String[] args){
        try {
            System.out.println(inputAge());
            System.out.println(inputName());
        } catch (AgeInputException e) {
            e.printStackTrace();
        } catch (NameInputException e) {
            e.printStackTrace();
            e.showWrongName();
        }
    }

    public static int inputAge() throws AgeInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        if (age < 0) {
            throw new AgeInputException();
        }
        return age;
    }

    public static String inputName() throws NameInputException {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        if (name.length() < 2) {
            throw new NameInputException(name);
        }
        return name;
    }
}

class NameInputException extends Exception {
    String name;

    NameInputException(String name) {
        super("잘못된 이름이 입력되었습니다.");
        this.name = name;
    }

    public void showWrongName() {
        System.out.println(name + "은/는 잘못된 이름입니다.");
    }
}

/*
15.
(Throwable) 을 상속하는 예외 클래스는 (Exception) 과 (Error) 두 가지이다.
그런데 (Error) 는 그 이름이 의미하듯이 단순히 예외라고 하기에는 심각한 오류의 상황을 표현하기 위해 정의된 클래스이다.
따라서 이 클래스를 상속하여 정의된 클래스는(이는 프로그래머가 정의하는 클래스가 아니다.)
프로그램의 실행을 멈춰야 할 정도의 매우 심각한 오류상황을 표현하는데 사용이 된다. (Error)를 상속하는 대표적인 클래스의 이름은 (VirtualMachineError) 이다.
API 문서에서는 이 클래스에 대해서 다음과 같이 설명한다.
"자바 가상머신에 문제가 생겨서 더 이상 제대로 동작할 수 없는 상황을 알리기 위해서 정의된 클래스입니다."
(Error) 를 상속하는 클래스의 오류상황이 발생하면, 그냥 프로그램이 종료되도록 놔두는 것이 상책이다(프로그램이 종료된 뒤  소스코드를 수정하는 등의 방식으로 원인을 해결해야 한다.)

(VirtualMachineError) 의 하위 클래스
(Error) 를 상속하는 대표적인 클래스가 (VirtualMachineError) 이다. 그리고 이를 상속하는 클래스 중에서 (OutOfMemoryError) 라는 클래스가 있는데, 이는 메모리 공간이 부족한 상황을 표현하는 예외 클래스이다.
따라서 이러한 오류가 발생하면, 메모리가 효율적으로(또는 적절히) 사용되도록 소스코드 자체를 변경해야 한다. 이렇듯 Error 와 관련 있는 오류상황은 소스코드의 변경을 통해서 해결해야 하는 경우가 대부분이다.
16.
IOException, RuntimeException
17.
try-catch 구문을 사용하거나 throws 키워드를 사용해 메소드를 호출한 영역으로 예외를 던져준다.
18.
clone 메소드는 CloneNotSupportedException에 대한 예외처리를 해줘야 한다.
19.
RunTimeException
20.
NullPointException
ArithmeticException ...
 */