package structural.decorator;

public class LeftBracketDecorator extends Decorator{
    public LeftBracketDecorator(PrinterInterface printer) {
        super(printer);
    }

    public void print(){
        System.out.print("[");
        printer.print();
    }
}
