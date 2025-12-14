package ch08.sec09;

public class InterfaceCimpl implements InterfaceC{
    public void methodA(){
        System.out.println("InterfaceImpli-methodA() 실행");
    }

    public void methodB(){
        System.out.println("InterfaceCImpl-methodB() 실행");
    }

    public void methodC(){
        System.out.println("InterfaceCImpli-methodC() 실행");
    }
}
