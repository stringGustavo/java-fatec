import java.util.Scanner;

public class  Ex08 {
    public static void main(String[] args) {
        //Escrever a classe ConversaoDeUnidadesDeArea com métodos para conversão das unidades de área.

        AreaUnitConversion conversion = new AreaUnitConversion();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Square Meter to Square Feet;\n2 - Square Feet to Square Centimeter;\n3 - Mile to Acre;\n4 - Acre to Square Feet.");
        System.out.print("\nSelect an option: ");
        byte option = sc.nextByte();

        conversion.convert(option);
        sc.close();
    }
}