import java.util.Objects;

public class PhoneInfo implements Comparable{
    private String name;
    private String phone;

    PhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void showPhoneInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }

    @Override
    public boolean equals(Object obj) {
        PhoneInfo comp = (PhoneInfo) obj;
        return phone.equals(comp.phone);
    }

    @Override
    public int compareTo(Object o) {
        PhoneInfo comp = (PhoneInfo) o;
        return phone.compareTo(comp.phone);
    }
}