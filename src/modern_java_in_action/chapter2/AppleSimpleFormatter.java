package modern_java_in_action.chapter2;

public class AppleSimpleFormatter implements AppleFormatter{
    public String accept(Apple apple){
        return "An apple of "+apple.getWeight()+" g";
    }
}
