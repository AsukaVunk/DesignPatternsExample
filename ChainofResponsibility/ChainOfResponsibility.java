package ChainofResponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logging(AbstractLogger.INFO,"This is an information.");
        loggerChain.logging(AbstractLogger.DEBUG,"This is a debug level information.");
        loggerChain.logging(AbstractLogger.ERROR,"This is an error information.");
    }

    public static AbstractLogger getChainOfLoggers(){
        AbstractLogger consoleLogger= new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
