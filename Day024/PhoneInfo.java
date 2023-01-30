public class PhoneInfo {
    private String name, phone;

    public PhoneInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void showPhoneInfo() {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
    }

    public String getName() {
        return name;
    }
}
