package basics;

import java.time.LocalTime;

public class ApplicationTimer {
    /*
    0 0 0 15 -> 0:0:15
    0 0 59 1 -> 0:1:0
    0 0 0 60 -> 0:1:0
    0 0 0 70 -> 0:1:10
    0 0 0 3600 -> 1:0:0
    0 59 0 60 -> 1:0:0
    23 59 59 1 -> 0:0:0
    0 0 0 86400 -> 0:0:0
    0 0 0 172800 -> 0:0:0
    */
    public static void main(String[] args) {
        System.out.println(getTime(0, 0, 0, 15));
        System.out.println(getTime(0, 0, 59, 1));
        System.out.println(getTime(0, 0, 0, 60));
        System.out.println(getTime(0, 0, 0, 70));
        System.out.println(getTime(0, 0, 0, 3600));
        System.out.println(getTime(0, 59, 0, 60));
        System.out.println(getTime(23, 59, 59, 1));
        System.out.println(getTime(0, 0, 0, 86400));
        System.out.println(getTime(0, 0, 0, 172800));
    }

    static String getTime(int h, int m, int s, int interval) {
        LocalTime time = LocalTime.of(h, m, s, 0);
        time = time.plusSeconds(interval);

//        int sec = h * 3600 + m * 60 + s + interval;
//        int hours = sec / 3600 % 24;
//        int minutes = sec / 60 % 60;
//        int seconds = sec % 60;

        return String.format("%s:%s:%s", time.getHour(), time.getMinute(), time.getSecond());
//        return String.format("%s:%s:%s", hours, minutes, seconds);
    }
}
