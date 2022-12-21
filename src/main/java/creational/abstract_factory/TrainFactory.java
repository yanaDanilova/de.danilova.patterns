package creational.abstract_factory;

public class TrainFactory  implements Factory2{

    @Override
    public Transport createTransport() {
        return new Train();
    }
}
