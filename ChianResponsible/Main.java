package ChianResponsible;

public class Main {
    public static void main(String[] args) {
        LoggerProcesser logger=new WarningLoggerProcessor
        (new InfoLoggerProcesser(new ErrorLoggerProcessor(null)));
logger.log(LoggerProcesser.Warning,"THIS IS WARNINg");
logger.log(LoggerProcesser.INFO,"THIS IS INFO");
logger.log(LoggerProcesser.ERROR,"THIS IS ERROR");
    }
   

}
