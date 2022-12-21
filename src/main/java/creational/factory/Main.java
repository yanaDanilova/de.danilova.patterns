package creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        factory.create("Bmw").drive();
        factory.create("Audi").drive();
    }
}
