package study.clebeg.maven.userlog;

import java.util.Date;

public class Log {
    public static void log( String str ) {
        System.out.println(new Date() + "-----" + str);
    }
}
