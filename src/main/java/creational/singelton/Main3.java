package creational.singelton;

public class Main3 {
    public static void main(String[] args) {
        Singelton singelton = Singelton.getInstance();
        System.out.println(singelton);
        Singelton singelton1 = Singelton.getInstance();
        System.out.println(singelton1);
    }
}
