package creational.abstract_factory;

import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {

       Transport bus = Objects.requireNonNull(TransportAbstractFactory.createFactory("BusFactory")).createTransport();
       bus.drive();

       Transport train = Objects.requireNonNull(TransportAbstractFactory.createFactory("TrainFactory")).createTransport();
       train.drive();

    }
}
