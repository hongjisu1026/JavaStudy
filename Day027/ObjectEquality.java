import java.util.Objects;

class IntNumber {
    int num;

    public IntNumber(int num) {
        this.num = num;
    }

    public boolean isEquals(IntNumber numObj) {
        return num == numObj.num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class ObjectEquality {
    public static void main(String[] args) {
        IntNumber num1 = new IntNumber(10);
        IntNumber num2 = new IntNumber(12);
        IntNumber num3 = new IntNumber(10);

        /*if (num1.isEquals(num2))
            System.out.println("num1과 num2는 동일한 정수");
        else
            System.out.println("num1과 num2는 다른 정수");

        if (num1.isEquals(num3))
            System.out.println("num1과 num3는 동일한 정수");
        else
            System.out.println("num1과 num3는 다른 정수");*/

        if (Objects.equals(num1, num2))
            System.out.println("num1과 num2는 동일한 정수");
        else
            System.out.println("num1과 num2는 다른 정수");

        if (num1.equals(num3))
            System.out.println("num1과 num3는 동일한 정수");
        else
            System.out.println("num1과 num3는 다른 정수");
    }
}