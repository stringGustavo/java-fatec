public class Value {
    private int valueA, valueB, valueC, delta;
    private double root1, root2;

    public Value () {
        valueA = 1;
        valueB = 1;
        valueC = 1;
        delta = 1;
        root1 = 1;
        root2 = 1;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }

    public void setValueC(int valueC) {
        this.valueC = valueC;
    }

    public int getValueA() {
        return valueA;
    }

    public int getValueB() {
        return valueB;
    }

    public int getValueC() {
        return valueC;
    }

    private int delta () {
        this.delta = (valueB * valueB) - 4 * valueA * valueC;

        return delta;
    }

    public void showRoots () {
        root1 = (-valueB + Math.sqrt(delta())) / (2 * valueA);
        root2 = (-valueB - Math.sqrt(delta())) / (2 * valueA);

        if(delta() >= 0) {
            System.out.printf("\nx\': %f\nx\": %f", root1, root2);
        } else {
            System.out.print("\nNegative Discriminant. Neither of the roots are real numbers.");
        }
    }


}
