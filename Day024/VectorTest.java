import java.util.Vector;

class VectorPhoneInfo {
    private String name;
    private String phone;

    public VectorPhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showPhoneInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phone);
    }

    @Override
    public String toString() {
        return name + " " + phone;
    }
}

class VectorTest {
    public static void main(String[] args) {
        Vector vec = new Vector();
        VectorPhoneInfo info1 = new VectorPhoneInfo("홍길동", "010");
        VectorPhoneInfo info2 = new VectorPhoneInfo("배트맨", "011");
        vec.add(info1);
        vec.add(info2);
        for (int i = 0; i < vec.size(); i++) {
            VectorPhoneInfo info = (VectorPhoneInfo) vec.get(i);
            info.showPhoneInfo();
        }
        System.out.println("==================");
        for (Object obj : vec) {
            VectorPhoneInfo info = (VectorPhoneInfo) obj;
            info.showPhoneInfo();
        }
        System.out.println("==================");
        for (Object obj : vec) {
            System.out.println(obj);
        }

    }
}

class VectorTest2 {

    public static void main(String[] args) {
        Vector<VectorPhoneInfo> vec = new Vector<VectorPhoneInfo>();
        VectorPhoneInfo info1 = new VectorPhoneInfo("홍길동", "010");
        VectorPhoneInfo info2 = new VectorPhoneInfo("배트맨", "011");
        vec.add(info1);
        vec.add(info2);
        for (int i = 0; i < vec.size(); i++) {
            VectorPhoneInfo info = vec.get(i);
            info.showPhoneInfo();
        }
        System.out.println("==================");
        for (VectorPhoneInfo info : vec) {
            info.showPhoneInfo();
        }
        System.out.println("==================");
        for (VectorPhoneInfo info : vec) {
            System.out.println(info);
        }
    }
}