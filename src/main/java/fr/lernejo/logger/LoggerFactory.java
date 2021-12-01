package fr.lernejo.logger;

public class LoggerFactory implements Logger{
    @Override
    public void log(String message) {
        System.out.println(message);
    }

    public static Logger getLogger(String name){
        return new ConsoleLogger();
    }
}
