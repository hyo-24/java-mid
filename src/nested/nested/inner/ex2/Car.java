package nested.nested.inner.ex2;

public class Car { // 메인에서 사용
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) { // 생성자 호출로만 값을 지정
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // 모델이름이랑 충전레벨은 매개변수로 받은 걸 설정하고 엔진은 새로 생성해서 필드로 설정함
    }

    public void start() { // 메인에서 호출하는 메서드
        engine.start();
        System.out.println(model + "시작 완료");
    }

    private class Engine { // Car 에서만 사용하는 클래스

        public void start() { // 왜 private 으로 설정할까? ➡️ 내부 클래스가 외부 클래스의 private에 접근 가능하지만 그 반대는 안된다.
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model+" 의 엔진을 구동합니다.");
        }
    }
}
