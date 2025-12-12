package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.comapny : "+car1.company);

        Car car2= new Car("자가용");
        System.out.println("car2.comapny"+car2.company);
        System.out.println("car2.model:"+car2.model);

        Car car3= new Car("자가용","빨강");
        System.out.println("car.color"+car3.model);
    }
}
