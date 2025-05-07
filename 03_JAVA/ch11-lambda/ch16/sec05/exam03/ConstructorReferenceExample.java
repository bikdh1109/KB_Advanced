package advanced.ch16.sec05.exam03;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(id -> {
            return new Member(id);
        });
        System.out.println(m1);
        System.out.println();

        Member m2  = person.getMember2((id, name) -> {
           return new Member(id, name);
        });
        System.out.println(m2);
    }
}
