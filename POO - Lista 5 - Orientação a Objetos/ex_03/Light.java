public class Light {
    private String lightFirstState;
    private String lightSecondState;
    private String lightThirdState;

    public Light () {
        lightFirstState = "Light Off";
        lightSecondState = "Light On";
        lightThirdState = "Half-Shade";
    }

    public void showState (int option) {
        switch(option) {
            case 0:
                System.out.printf("\nLight State: %s", getLightFirstState());
            break;

            case 1:
                System.out.printf("\nLight State: %s", getLightSecondState());
            break;

            case 2:
                System.out.printf("\nLight State: %s", getLightThirdState());
            break;

            default:
                System.out.println("\nERROR - Invalid Light State.");
            break;
        }
    }

    public void setLightFirstState (String lightFirstState) {
        this.lightFirstState = lightFirstState;
    }

    public void setLightSecondState(String lightSecondState) {
        this.lightSecondState = lightSecondState;
    }

    public void setLightThirdState(String lightThirdState) {
        this.lightThirdState = lightThirdState;
    }

    public String getLightFirstState() {
        return lightFirstState;
    }

    public String getLightSecondState() {
        return lightSecondState;
    }

    public String getLightThirdState() {
        return lightThirdState;
    }
}
