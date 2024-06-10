package ChianResponsible;

public class WarningLoggerProcessor extends LoggerProcesser {
    LoggerProcesser nexLoggerProcesser;
    public WarningLoggerProcessor(LoggerProcesser nextLoggerProcesser)
    {
        super(nextLoggerProcesser);
    }
    public void log(int loglevel,String msg){
        if(loglevel==Warning){
            System.out.println("Warning : "+msg);
        }
        else{
            super.log(loglevel, msg);
        }
    }
}
