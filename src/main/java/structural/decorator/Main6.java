package structural.decorator;

public class Main6 {
    public static void main(String[] args) {

        PrinterInterface printer = new RightBracketDecorator(new LeftBracketDecorator(new QuotesDecorator(new Printer("Hello"))));
        printer.print();

    }
}
