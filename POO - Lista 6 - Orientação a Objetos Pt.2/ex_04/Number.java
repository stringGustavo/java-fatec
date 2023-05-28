public class Number {
    private long number;

    public Number () {
        number = 0;
    }

    public void setNumber (long number) {
        this.number = number;
    }

    public long getNumber () {
        return number;
    }

    public long reverseNumber () {
        long remainder = 0, reverse = 0;
		boolean negative;
		
		if(number < 0) {
			negative = true;
			number *= -1;
		} else {
			negative = false;
		}		
		
		while(number > 0) {
			remainder = number % 10;
			
			reverse = (reverse * 10) + remainder;
			
			number /= 10;
		}
		
		if(negative) {
			reverse *= -1;
			return reverse;
		} else {
			return reverse;
		}
    }
}
