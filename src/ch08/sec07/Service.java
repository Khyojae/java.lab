package ch08.sec07;

public interface Service {
    default void defaultMethod1(){
        System.out.println("defaultMethod1 종속코드");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("defaultMehtod2 종속 코드");
        defaultCommon();
    }

    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드a");
        System.out.println("defaultMethod 중복 코드b");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }
    private static void staticCommon(){
        System.out.println("staticMethod 중복 코드 c");
        System.out.println("staticMethod 중복 코드 d");
    }
}
