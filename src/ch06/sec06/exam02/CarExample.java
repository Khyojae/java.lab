package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("제작회사:"+myCar.company);
        System.out.println("색깔"+myCar.color);

        myCar.speed=60;
        System.out.println("수정된 속도"+myCar.speed);
    }
}
