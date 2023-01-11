package behavioral.visitor;

public class CarBody implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
