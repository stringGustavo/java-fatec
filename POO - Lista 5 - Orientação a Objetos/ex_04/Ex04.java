import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.

        Date date = new Date();
        Scanner sc = new Scanner(System.in);

        System.out.print("Day: ");
        date.setDay(sc.nextByte());

        System.out.print("Month: ");
        date.setMonth(sc.nextByte());

        System.out.print("Year: ");
        date.setYear(sc.nextShort());
        sc.close();

        date.showDate(date.verifyDate(date.getDay(), date.getMonth(), date.getYear(), date.isLeapYear(date.getYear())));
    }
}
