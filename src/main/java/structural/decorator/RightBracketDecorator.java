package structural.decorator;

public class RightBracketDecorator extends Decorator{
    public RightBracketDecorator(PrinterInterface printer) {
        super(printer);
    }

    public void print(){
        printer.print();
        System.out.print("]");
    }
}
