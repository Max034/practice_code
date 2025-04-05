import java.util.Scanner;

interface A{
    public void show();
}

interface B{
    public void Run();
}

interface C{
    public void Jump();
}
interface D{
    public void stop();
}

class test implements A,B,C,D{
    public void show(){
        System.out.println("Working : show()");
    }
    public void Run(){
        System.out.println("Run()");
    }
    public void Jump(){
        System.out.println("Jump()");
    }
    public void stop(){
        System.out.println("Stop()");
    }
}

public class Main {
    public static void main(String arg[]){
        Scanner p = new Scanner(System.in);

        test obj = new test();
        obj.show();
        obj.Run();
        obj.Jump();
        obj.stop();
    }
}