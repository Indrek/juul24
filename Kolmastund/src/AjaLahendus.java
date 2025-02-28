public class AjaLahendus {

    public static void main(String[] args) {
        System.out.println(getDuration(-1,1));
        System.out.println(getDuration(1,-1));
        System.out.println(getDuration(1,100));
        System.out.println(getDuration(66,7));
        System.out.println(getDuration(-10));
        System.out.println(getDuration(3666));

        String aeg = getDuration(60);

    }

    public static String getDuration(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return "Vale väärtus";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        //boonus
        String hoursString = convertString(hours, "h");
        String minutesString = convertString(remainingMinutes, "m");
        String secondsString = convertString(seconds, "s");

        return hoursString + " " +  minutesString + " " + secondsString;
    }

    public static String getDuration(int seconds) {
        if (seconds<0) {
            return "Vale väärtus";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDuration(minutes, remainingSeconds);
    }
    public static String convertString(int number, String unit) {
        String numberString = number + unit;
        if(number<10){
            numberString = "0" + numberString;
        }
        return numberString;
    }


}
