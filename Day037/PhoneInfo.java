import java.io.Serializable;

public class PhoneInfo implements Serializable {
    private String name, phone;

    public PhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showPhoneInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
    }

    public String getPhone() {
        return phone;
    }
}
