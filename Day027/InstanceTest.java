class InstanceTest {
    public static void main(String[] args) {
        int num = 3;
        Number number = new Number(num);
        showData(number);
    }

    public static void showData(Object obj) {
        System.out.println(obj);
    }
}

class Number {
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}