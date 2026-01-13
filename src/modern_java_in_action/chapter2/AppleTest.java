package modern_java_in_action.chapter2;

import modern_java_in_action.chapter2.Apple;
import modern_java_in_action.chapter2.AppleFormatter;
import java.util.List;

// 클래스 선언을 명시적으로 추가합니다.
public class AppleTest {

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
       List<Apple> inventory = List.of(
               new Apple(150,"green"),
               new Apple(200,"red")
       );
        prettyPrintApple(inventory, (Apple apple) -> "An apple weighs " + apple.getWeight() + "g");
    }
}