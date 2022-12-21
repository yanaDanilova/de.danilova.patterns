package creational.abstract_factory;

public class Train implements Transport{
    @Override
    public void drive() {
        System.out.println("drive train");
    }
}
