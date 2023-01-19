package test;

public class PhoneInfo {
    private String name, phone, birth;

    PhoneInfo(String name, String phone, String birth) {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }

    PhoneInfo(String name, String phone) {
        this(name, phone, null);
    }

    public void printPhoneInfo() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("birth : " + birth);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
