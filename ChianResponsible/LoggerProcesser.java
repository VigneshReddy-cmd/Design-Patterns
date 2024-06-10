package ChianResponsible;

public abstract class LoggerProcesser {
    protected final static int INFO=1;
    protected final static int ERROR=1;
    protected final static int Warning=1;
    LoggerProcesser nexLoggerProcesser;
    public LoggerProcesser(LoggerProcesser nexLoggerProcesser){
        this.nexLoggerProcesser=nexLoggerProcesser;
    }
    public void log(int loglevel,String msg){
        if(nexLoggerProcesser!=null){
            nexLoggerProcesser.log(loglevel, msg);
        }
    }
}
