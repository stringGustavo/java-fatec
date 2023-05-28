import java.util.Scanner;

public class Ex01 {
	
	//Gustavo Sant'anna dos Santos;

	public static void main (String[] args) {
		//01 - Criar uma classe para representar uma lampada vendida em um supermercado. Alem de marca, modelo e tipo, esta deve conter um atributo que indique um dos dois possiveis estados da lampada (acesa ou apagada).
		
		Scanner scan = new Scanner(System.in);
		
		LightBulb light = new LightBulb();
		
		System.out.print("Lightbulb brand: ");
		String brand = scan.nextLine();
		
		System.out.print("Lightbulb model: ");
		String model = scan.nextLine();
		
		System.out.print("Lightbulb type: ");
		String type = scan.nextLine();
		
		scan.close();
		
		light.setBrand("Brand: " + brand);
		light.setModel("Model: " + model);
		light.setType("Type: " + type);
		
		System.out.println("");
		System.out.println(light.getBrand() + "\n" + light.getModel() + "\n" + light.getType());
		System.out.println(light.onOff());
	}
}

