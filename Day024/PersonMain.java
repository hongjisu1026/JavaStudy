public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 20);
        try {
            Person cpyPerson = (Person) person.clone();
            person.show();
            cpyPerson.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
