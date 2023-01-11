package behavioral.visitor;

public interface Visitor {
    void visit(CarBody body);
    void visit(Engine engine);
}
