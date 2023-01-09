package structural.decorator;

public class QuotesDecorator extends Decorator{
    public QuotesDecorator(PrinterInterface printer) {
        super(printer);
    }
    public void print(){
        System.out.print("\"");
        printer.print();
        System.out.print("\"");
    }
}
