package orange.seller;

public class Friend {
    String name, birth, address;

    public Friend(String name, String birth, String address) {
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println("생일 : " + birth);
        System.out.println("주소 : " + address);
    }

    @Override
    public String toString() {
        return "name" + " " + "address";
    }

    @Override
    protected Friend clone() throws CloneNotSupportedException {
        return (Friend) super.clone();
    }
}
