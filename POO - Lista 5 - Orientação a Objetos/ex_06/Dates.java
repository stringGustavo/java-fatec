import java.time.format.ResolverStyle;
import java.time.format.DateTimeParseException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Dates {
    private int firstDateDay, firstDateMonth, firstDateYear;
    private int secondDateDay, secondDateMonth, secondDateYear;

    private String date;

    public Dates () {
        firstDateDay = 0;
        firstDateMonth = 0;
        firstDateYear = 0;
        
        secondDateDay = 0;
        secondDateMonth = 0;
        secondDateYear = 0;
        
        date = "";
    }

    public void setFirstDay (int firstDateDay) {
        this.firstDateDay = firstDateDay;
    }

    
    public void setFirstMonth (int firstDateMonth) {
        this.firstDateMonth = firstDateMonth;
    }
    
    public void setFirstYear (int firstDateYear) {
        this.firstDateYear = firstDateYear;
    }

    public void setSecondDay(int secondDateDay) {
        this.secondDateDay = secondDateDay;
    }

    public void setSecondMonth(int secondDateMonth) {
        this.secondDateMonth = secondDateMonth;
    }

    public void setSecondYear(int secondDateYear) {
        this.secondDateYear = secondDateYear;
    }

    public int getFirstDay() {
        return firstDateDay;
    }

    public int getFirstMonth() {
        return firstDateMonth;
    }

    public int getFirstYear() {
        return firstDateYear;
    }

    public int getSecondDay() {
        return secondDateDay;
    }

    public int getSecondMonth() {
        return secondDateMonth;
    }

    public int getSecondYear() {
        return secondDateYear;
    }

    public String date (int dateDay, int dateMonth, int dateYear) {
        String d = Integer.toString(dateDay);
        String m = Integer.toString(dateMonth);
        String y = Integer.toString(dateYear);

        if(dateDay >= 10 && dateMonth >= 10) {
            date = d + "/" + m + "/" + y;
        } else if(dateDay < 10 && dateMonth < 10) {
            date = "0" + d + "/0" + m + "/" + y;
        } else if(dateMonth < 10) {
            date = d + "/0" + m + "/" + y;
        } else if(dateDay < 10) {
            date = "0" + d + "/" + m + "/" + y;
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

    public void dateDiff () {
        LocalDate firstDate = LocalDate.of(firstDateYear, firstDateMonth, firstDateDay);
        LocalDate secondDate = LocalDate.of(secondDateYear, secondDateMonth, secondDateDay);
        Period period = Period.between(firstDate, secondDate);

        int days = period.getDays();
        int months = period.getMonths();
        int years = period.getYears();

        int diff = firstDate.compareTo(secondDate);

        if(diff > 0) {
            System.out.println("\nFirst Date is Higher.");
            System.out.println("Second Date is Lower.");
        } else if(diff < 0) {
            System.out.println("\nSecond Date is Higher.");
            System.out.println("First Date is Lower.");
        } else {
            System.out.println("\nBoth dates are equals.");
        }

        System.out.printf("\nDifference between %s and %s:\n", date(firstDateDay, firstDateMonth, firstDateYear), date(secondDateDay, secondDateMonth, secondDateYear));
        System.out.printf("Days: %d\nMonths: %d\nYears: %d", days, months, years);
    }

    public void showDate () {
        if(isValid(date(firstDateDay, firstDateMonth, firstDateYear))) {
            System.out.println("\nFirst Date: " + date(firstDateDay, firstDateMonth, firstDateYear));
        } else {
            System.out.println("\nFirst Date: Invalid.");
            System.exit(0);
        }

        if(isValid(date(secondDateDay, secondDateMonth, secondDateYear))) {
            System.out.println("Second Date: " + date(secondDateDay, secondDateMonth, secondDateYear));
        } else {
            System.out.println("Second Date: Invalid.");
            System.exit(0);
        }
    }
}