public class ComputerModel {
    private String motherBoard;
    private String cpu;
    private String ram;
    private String hd;
    private String monitor;

    private double motherBoardPrice;
    private double cpuPrice;
    private double ramPrice;
    private double hdPrice;
    private double monitorPrice;

    public ComputerModel () {
        motherBoard = "Generic Motherboard";
        cpu = "undefined";
        ram = "undefined";
        hd = "undefined";
        monitor = "undefined";

        motherBoardPrice = 800;
        cpuPrice = 0;
        ramPrice = 0;
        hdPrice = 0;
        monitorPrice = 0;
    }

    public void setCpu(byte option) {
        switch(option) {
            case 1:
                this.cpu = "1600Mhz";
                this.cpuPrice = 700;
            break;

            case 2:
                this.cpu = "1800Mhz";
                this.cpuPrice = 830;
            break;

            case 3:
                this.cpu = "1900Mhz";
                this.cpuPrice = 910;
            break;
        }
    }

    public void setRam(byte option) {
        switch(option) {
            case 1:
                this.ram = "1GB";
                this.ramPrice = 350;
            break;

            case 2:
                this.ram = "2GB";
                this.ramPrice = 700;
            break;

            case 3:
                this.ram = "4GB";
                this.ramPrice = 1400;
            break;

            case 4:
                this.ram = "6GB";
                this.ramPrice = 2100;
            break;

            case 5:
                this.ram = "8GB";
                this.ramPrice = 2800;
            break;
        }
    }

    public void setHd(byte option) {
        switch(option) {
            case 1:
                this.hd = "500GB";
                this.hdPrice = 300;
            break;

            case 2:
                this.hd = "1TB";
                this.hdPrice = 420;
            break;

            case 3:
                this.hd = "2TB";
                this.hdPrice = 500;
            break;
        }
    }

    public void setMonitor(byte option) {
        switch(option) {
            case 1:
                this.monitor = "15\" inch";
                this.monitorPrice = 320;
            break;

            case 2:
                this.monitor = "17\" inch";
                this.monitorPrice = 520;
            break;
        }
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public double getMotherBoardPrice() {
        return motherBoardPrice;
    }

    public String getCpu() {
        return cpu;
    }

    public double getCpuPrice() {
        return cpuPrice;
    }

    public String getRam() {
        return ram;
    }

    public double getRamPrice() {
        return ramPrice;
    }

    public String getHd() {
        return hd;
    }

    public double getHdPrice() {
        return hdPrice;
    }

    public String getMonitor() {
        return monitor;
    }

    public double getMonitorPrice() {
        return monitorPrice;
    }

    public double priceCalculator () {
        double price = getMotherBoardPrice() + getRamPrice() + getCpuPrice() + getHdPrice() + getMonitorPrice();

        return price;
    }
}
