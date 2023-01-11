package behavioral.visitor;

public class Man implements Visitor{
    @Override
    public void visit(CarBody body) {
        System.out.println("washed the car");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("fix the engine");
    }
}
