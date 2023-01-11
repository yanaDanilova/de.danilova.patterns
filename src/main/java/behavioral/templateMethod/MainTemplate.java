package behavioral.templateMethod;

public class MainTemplate {

    public static void main(String[] args) {
        C a = new A();
        C b = new B();


        b.templateMethod();
        a.templateMethod();
    }




}
