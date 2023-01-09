package structural.decorator;

public abstract class Decorator implements PrinterInterface {
    PrinterInterface printer;

    public Decorator(PrinterInterface printer){
        this.printer = printer;
    }

}
