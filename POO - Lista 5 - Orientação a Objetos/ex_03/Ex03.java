import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args) {
        //Escrever uma classe que implemente uma lâmpada de três estados: apagada, acesa ou meia-luz.

        Light light = new Light();
        Scanner sc = new Scanner(System.in);

        int option;

        System.out.print("Select a light State [0, 1 or 2]:");
        option = sc.nextInt();
        sc.close();

        light.showState(option);
    }
}
