package behavioral.visitor;

public class Women implements Visitor {
    @Override
    public void visit(CarBody body) {
        System.out.println("look in mirror");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("check the oil");
    }
}
