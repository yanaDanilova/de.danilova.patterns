package creational.singelton;

public class Singelton {

    private static Singelton singelton = new Singelton();
    private Singelton(){

    }
    static Singelton getInstance(){
        return singelton;
    }
}
