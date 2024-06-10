package ChianResponsible;

public class ErrorLoggerProcessor extends LoggerProcesser {
    LoggerProcesser nextLoggerProcesser;
    public ErrorLoggerProcessor(LoggerProcesser nextLoggerProcesser){
        super(nextLoggerProcesser);
    }
    public void log(int loglevel,String msg){
        if(loglevel==ERROR){
            System.out.println("ERROR : "+msg);
        }
        else{
            super.log(loglevel, msg);
        }
    }
}
