import java.util.Scanner;

public class Ex04V2 {
    public static void main(String[] args) {
        //Criar uma classe para representar uma Data, onde teremos dia, mês e ano. Criar um método booleano que indicará se uma data inserida é válida ou não. Outro método necessário é o mostrar data.

        DateV2 date = new DateV2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Day: ");
        date.setDay(sc.nextInt());
        
        System.out.print("Month: ");
        date.setMonth(sc.nextInt());

        System.out.print("Year: ");
        date.setYear(sc.nextInt());

        sc.close();

        date.showDate();
    }
}
