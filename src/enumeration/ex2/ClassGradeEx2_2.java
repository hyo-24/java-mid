package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        ClassGrade newClassGrade = new ClassGrade(); // 상수를 가진 클래스의 객체
        int result = discountService.discount(newClassGrade,price);
        System.out.println("newClassGrade 등급의 할인 금액: "+result);
    }
}
