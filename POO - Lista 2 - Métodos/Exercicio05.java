import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		//Gustavo Sant'Anna dos Santos;
		
		System.out.println("05 - Baseado no exercicio anterior, crie uma nova versao, que calcula as raizes de uma equacao do segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente \'a\' deve ser diferente de zero. Caso o delta seja maior ou igual a zero, as raizes serao reais. Caso o delta seja negativo, as reais serao complexas e da forma, assim retorne zero.\n");
	
		calculoDelta();
	}
	
	static void calculoDelta() {
		double a, b, c, delta;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = scan.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = scan.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = scan.nextInt();
		
		delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nDelta: %.0f", delta);
		
		if(delta < 0) {
			System.out.print("\nDelta Negativo, Sem raizes reais!");
		} else {	
			calculoRaizes(delta, a, b);
		}
	}
	
	static void calculoRaizes(double delta, double a, double b) {
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nx\': %.2f\nx\": %.2f", x1, x2);
	}
}

