package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println(str); // 다른 부분을 메서드에 입력 받는 형식으로 하면 된다는 걸 생각을 못함.
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("hello Java");
        hello("hello Spring");
    }

}

