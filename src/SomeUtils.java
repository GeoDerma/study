import java.util.Date;
public class SomeUtils {

    /** Use minutes to find when time to do something */
    public long findDateTimeEnd(double dateEndedMinutes) {
        Date date = new Date();
        long millis = date.getTime();
        return millis + (int)(dateEndedMinutes * 60000);
    }

}
