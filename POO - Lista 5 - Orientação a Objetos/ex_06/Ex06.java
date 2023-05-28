import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //Utilizando o exercício 4 (Data) criar uma classe testadora de datas, onde o haverá duas datas e métodos para comparar se são iguais, qual é a maior e a menor e a diferença, em dias, de uma para a outra. Supor anos de 365 dias.

        Dates date = new Dates();
        Scanner sc = new Scanner(System.in);

        System.out.print("[First Date] Day: ");
        date.setFirstDay(sc.nextInt());
        
        System.out.print("[First Date] Month: ");
        date.setFirstMonth(sc.nextInt());

        System.out.print("[First Date] Year: ");
        date.setFirstYear(sc.nextInt());

        System.out.print("\n[Second Date] Day: ");
        date.setSecondDay(sc.nextInt());
        
        System.out.print("[Second Date] Month: ");
        date.setSecondMonth(sc.nextInt());

        System.out.print("[Second Date] Year: ");
        date.setSecondYear(sc.nextInt());

        sc.close();

        date.showDate();
        date.dateDiff();
    }
}
