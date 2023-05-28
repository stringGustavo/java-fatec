import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //Criar uma classe para resolver a equação do segundo grau, sendo necessário passar os valores de a, b e c. Criar um método interno para o cálculo do delta e um público para mostrar o valor das raízes, ou da raiz ou ainda informar que não existem raízes reais. Lembre-se de validar para ver é uma equação do segundo grau.

        Value value = new Value();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Coefficient A: ");
            value.setValueA(sc.nextInt());

            if(value.getValueA() == 0) {
                System.out.println("\nCoefficient A cannot be 0.\n");
            }
        } while(value.getValueA() == 0);

        System.out.print("\nCoefficient B: ");
        value.setValueB(sc.nextInt());

        System.out.print("\nCoefficient C: ");
        value.setValueC(sc.nextInt());

        sc.close();

        value.showRoots();
    }
}