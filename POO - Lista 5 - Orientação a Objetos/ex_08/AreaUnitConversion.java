import java.util.Scanner;

public class AreaUnitConversion {
    private double unitValue;

    private Scanner sc = new Scanner(System.in);

    public AreaUnitConversion () {
        unitValue = 1;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void convert(byte option) {
        char symbol = 178;
        switch(option) {
            case 1:
                System.out.print("Enter a Square Meter value: ");
                setUnitValue(sc.nextDouble());

                System.out.printf("\n%.1fm%c = %.1fft%c", getUnitValue(), symbol, getUnitValue() * 10.76, symbol);
            break;

            case 2:
                System.out.print("Enter a Square Feet value: ");
                setUnitValue(sc.nextDouble());

                System.out.printf("\n%.1fft%c = %.1fcm%c", getUnitValue(), symbol, getUnitValue() * 929, symbol);
            break;

            case 3:
                System.out.print("Enter a Mile value: ");
                setUnitValue(sc.nextDouble());

                System.out.printf("\n%.1f Mile(s) = %.1f acres", getUnitValue(), getUnitValue() * 640);                
            break;

            case 4:
                System.out.print("Enter an Acre value: ");
                setUnitValue(sc.nextDouble());

                System.out.printf("\n%.1f acre(s) = %.1fft%c", getUnitValue(), getUnitValue() * 43560, symbol);
            break;
        }
    }
}

