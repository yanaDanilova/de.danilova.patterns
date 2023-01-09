package creational.abstract_factory;

public class BusFactory implements Factory2{

    @Override
    public Transport createTransport() {
        return new Bus();
    }
}
