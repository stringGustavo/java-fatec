import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {
        //Crie uma classe para representar uma calculadora com as quatro operações básicas da aritmética conforme o diagrama abaixo e após uma classe que teste essa implementação.

        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();

        double firstNumber, secondNumber;
        char operator;

        System.out.println("Calculator\n");

        System.out.print("First Number: ");
        firstNumber = scan.nextDouble();
        calc.setFirstNumber(firstNumber);

        do {
            System.out.print("Arithmetic Operator: ");
            operator = scan.next().charAt(0);
        } while(operator != '+' && operator != '-' && operator != '*' && operator != '/');

        System.out.print("Second Number: ");
        secondNumber = scan.nextDouble();
        calc.setSecondNumber(secondNumber);

        scan.close();

        switch(operator) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", calc.getFirstNumber(), calc.getSecondNumber(), calc.addition(firstNumber, secondNumber));
            break;
            
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", calc.getFirstNumber(), calc.getSecondNumber(), calc.subtraction(firstNumber, secondNumber));
            break;

            case '*':
                System.out.printf("%.2f * %.2f = %.2f", calc.getFirstNumber(), calc.getSecondNumber(), calc.multiplication(firstNumber, secondNumber));          
            break;
            
            case '/':
            if(calc.getSecondNumber() == 0){
                System.out.println("Cannot divide by Zero!");
            } else {
                System.out.printf("%.2f / %.2f = %.2f", calc.getFirstNumber(), calc.getSecondNumber(), calc.division(firstNumber, secondNumber));
            }
            break;
        }
    }
}
