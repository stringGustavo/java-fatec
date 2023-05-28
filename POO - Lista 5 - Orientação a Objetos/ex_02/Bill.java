public class Bill {
    private int friends;
    private double value;
    private double waiterTip;
    private double finalValue;

    public Bill () {
        value = 0;
        friends = 0;
        waiterTip = 1.1;
        finalValue = 0;
    }

    public double billDivide () {
        finalValue = value / (double)friends;

        return finalValue;
    }

    public void setValue (double value) {
        if(value >= 0.1) {
            this.value = value;
        }
    }  
    
    public void setFriends (int friends) {
        this.friends = friends;
    }

    public void setWaiterTip (double waiterTip) {
        this.waiterTip = waiterTip;
    }
    
    public double getValue() {
        return value;
    }
    
    public int getFriends() {
        return friends;
    }
    
    public double getWaiterTip() { 
        return waiterTip;
    }
}   
