package structural.bridge;

public class Main5 {
    public static void main(String[] args) {

        Car mercedes = new Hatchback(new Mercedes());
        Car VW = new Sedan(new VW());

        mercedes.showDetails();
        VW.showDetails();


    }
}
