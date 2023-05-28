public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public Calculator () {
        firstNumber = 0;
        secondNumber = 0;
    }

    public void setFirstNumber (double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber (double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber () {
        return firstNumber;
    }

    public double getSecondNumber () {
        return secondNumber;
    }

    public double addition (double firstNumber, double secondNumber) {
        double addition = firstNumber + secondNumber;
        
        return addition;
    }

    public double subtraction (double firstNumber, double secondNumber) {
        double subtraction = firstNumber - secondNumber;

        return subtraction;
    }

    public double multiplication (double firstNumber, double secondNumber) {
        double multiplication = firstNumber * secondNumber;

        return multiplication;
    }

    public double division (double firstNumber, double secondNumber) {
        double division = firstNumber / secondNumber;

        return division;
    }
}
