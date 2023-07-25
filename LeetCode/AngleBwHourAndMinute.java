package LeetCode;

import java.lang.Math;

public class AngleBwHourAndMinute {
    public static float angle(int hour, int minute) {
        float result;
        float angleOfMinute = minute * 6;
        float angleOfHour = (minute / 12) * 6 + (12 - hour) * 30;

        if (angleOfMinute - angleOfHour < 180) {
            result = angleOfMinute - angleOfHour;
        } else {
            result = 360 - (angleOfMinute - angleOfHour);
        }
        return result;
    }

    // using Math library

    public static double angleBwHM(int hour, int minute) {
        double minute_angle = minute * 6;
        double hour_agle = (hour * 60 + minute) * 0.5;

        double angle = Math.abs(hour_agle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }

    public static void main(String[] args) {

        System.out.println(angleBwHM(12, 30));
    }
}
