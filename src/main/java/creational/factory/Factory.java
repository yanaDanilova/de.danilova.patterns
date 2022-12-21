package creational.factory;

public class Factory {

    public Car create(String type){
        switch (type){
            case "Bmw" : return new Bmw();
            case "Audi": return new Audi();
            default: return null;
        }
    }
}
