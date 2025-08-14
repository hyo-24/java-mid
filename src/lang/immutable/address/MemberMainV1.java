package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {

        Address address = new Address("서울");

        MemberV1 member1 = new MemberV1("회원1",address);
        MemberV1 member2 = new MemberV1("회원2",address);

        System.out.println("member1 = " + member1);
        System.out.println("member2 = " + member2);

        member2.getAddress().setValue("부산"); // getAddress() 로 address 참조값을 받아 Address의 setValue() 에 접근
        System.out.println("부산 -> member2.address");
        System.out.println("member1 = "+member1);
        System.out.println("member2 = "+member2);
    }
}
