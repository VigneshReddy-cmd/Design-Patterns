package ChianResponsible;

public class InfoLoggerProcesser  extends LoggerProcesser{
    LoggerProcesser nextLoggerProcesser;
    InfoLoggerProcesser(LoggerProcesser nexLoggerProcesser)
    {
        super(nexLoggerProcesser);
    }
    public void log(int loglevel,String msg){
        if(loglevel==INFO)
        {
            System.out.print("INFO :"+msg);
        }
        else{
            super.log(loglevel, msg);
        }
    }
}
