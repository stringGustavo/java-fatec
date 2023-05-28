public class Year {
    private int year;

    public Year () {
        year = 1;
    }

    public void setYear (int year) {
        if(year >= 1) {
            this.year = year;
        }
    }

    public int getYear () {
        return year;
    }

    public boolean isLeapYear () {
        boolean leapYear;
        
        if(year % 4 == 0) {
            leapYear = true;
            if(year % 100 == 0) {
                leapYear = false;
                if(year % 400 == 0) {
                    leapYear = true;
                }
            }
        } else {
            leapYear = false;
        }

        return leapYear;
    }
}
