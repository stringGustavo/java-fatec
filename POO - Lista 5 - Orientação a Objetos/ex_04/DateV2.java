import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class DateV2 {
    private int day;
    private int month;
    private int year;
    private String date;

    public DateV2 () {
        day = 0;
        month = 0;
        year = 0;
        date = "";
    }

    public void setDay (int day) {
        this.day = day;
    }

    public void setMonth (int month) {
        this.month = month;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String date () {
        String d = Integer.toString(day);
        String m = Integer.toString(month);
        String y = Integer.toString(year);

        if(day >= 10) {
            date = d+"/"+m+"/"+y;
        } else {
            date = "0"+d+"/"+m+"/"+y;
        }

        if(month >= 10) {
            date = d+"/"+m+"/"+y;
        } else {
            date = d+"/0"+m+"/"+y;
        }

        return date;
    }

    public boolean isValid (String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate ld = LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException exception) {
            return false;
        }
    }

    public void showDate () {
        if(isValid(date())) {
            System.out.println("\nDate: " + date());
        } else {
            System.out.println("\nInvalid Date.");
        }
    }
}
