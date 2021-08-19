import java.util.Calendar;

public class CalenderMain {
    public static String dayOfWeek(int year, int month, int day) {
        Calendar c =  Calendar.getInstance();
        c.set(year, month - 1, day);
        int dayWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayWeek) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(dayOfWeek(1996, 7, 15 ));
    }
}
