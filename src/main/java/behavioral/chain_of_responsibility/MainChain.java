package behavioral.chain_of_responsibility;

public class MainChain {

    public static void main(String[] args) {
        Logger logger1 = new SMSLogger(Level.ERROR.ordinal());
        Logger logger2 = new FileLogger(Level.DEBUG.ordinal());
        Logger logger3 = new EmailLogger(Level.INFO.ordinal());

        logger1.setNext(logger2);
        logger2.setNext(logger3);

        logger1.writeMessage("error", Level.ERROR.ordinal());
        logger1.writeMessage("debug", Level.DEBUG.ordinal());
        logger1.writeMessage("info",Level.INFO.ordinal());


    }
}
