package creational.abstract_factory;

public abstract class TransportAbstractFactory {

    public static Factory2 createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case "BusFactory" : return new BusFactory();
            case "TrainFactory" : return new TrainFactory();
            default: return null;
        }
    }
}
