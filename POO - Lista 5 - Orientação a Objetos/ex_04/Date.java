public class Date {
    private byte day;
    private byte month;
    private short year;
    
    public Date () {
        day = 0;
        month = 0;
        year = 2023;
    }

    
    public void setDay(byte day) {
        if(day > 0 && day <= 31) {
            this.day = day;
        }
    }
    
    public void setMonth(byte month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
    }
    
    public void setYear(short year) {
        if(year > 0) {
            this.year = year;
        }
    }
    
    public byte getDay() {
        return day;
    }
    
    public byte getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }
    
    public boolean isLeapYear (short year) {
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
    
    public void showDate (boolean verify) {     
        if(verify) {
            System.out.printf("\nDate: %d/%d/%d", day, month, year);
        } else {
            System.out.println("\nInvalid Date.");
        }
    }
    
    public boolean verifyDate (byte day, byte month, short year, boolean leapYear) {
        boolean verify = false;
    
        if(day >= 1 && month >= 1) {
            if(leapYear && month == 2) {
                if(day > 29) {
                    verify = false;
                } else {
                    verify = true;
                }
            } else {
                if(day > 28) {
                    verify = false;
                }  else {
                    verify = true;
                }
            }
    
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if(day > 31) {
                    verify = false;
                } else {
                    verify = true;
                }
            }
    
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                if(day > 30) {
                    verify = false;
                } else {
                    verify = true;
                }
            }
        }
    
        return verify;
    }
}
