import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        //Escrever uma classe ModeloDeComputador que encapsule valores que definam a configuração de um microcomputador (tipo de processador, memória RAM, tamanho do disco rígido, tamanho do monitor, por exemplo). Essa classe deve ter um método calcularPreco que calculará o preço do computador como sendo a soma do custo de seus componentes:

        ComputerModel pc = new ComputerModel();
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1 for 1600Mhz CPU - R$ 700\nType 2 for 1800Mhz CPU - R$ 830\nType 3 for 1900Mhz CPU - R$ 910");
        System.out.print("\nSelect a CPU: ");
        pc.setCpu(sc.nextByte());

        System.out.println("\nType 1 for 1GB RAM - R$ 350\nType 2 for 2GB RAM - R$ 700\nType 3 for 4GB RAM - R$ 1400\nType 4 for 6GB RAM - R$ 2100\nType 5 for 8GB RAM - R$ 2800");
        System.out.print("\nSelect a RAM: ");
        pc.setRam(sc.nextByte());

        System.out.println("\nType 1 for 500GB HD - R$ 300\nType 2 for 1TB HD - R$ 420\nType 3 for 2TB HD - R$ 500");
        System.out.print("\nSelect a HD: ");
        pc.setHd(sc.nextByte());

        System.out.println("\nType 1 for 15\" inch Monitor - R$ 320\nType 2 for 17\" inch Monitor - R$ 520");
        System.out.println("\nSelect a Monitor: ");
        pc.setMonitor(sc.nextByte());

        System.out.println("Computer Configuration: \n");
        System.out.printf("Motherboard: %s R$%.2f\nCPU: %s R$%.2f\nRAM: %s R$%.2f\nHD: %s R$%.2f\nMonitor: %s R$%.2f", pc.getMotherBoard(), pc.getMotherBoardPrice(), pc.getCpu(), pc.getCpuPrice(), pc.getRam(), pc.getRamPrice(), pc.getHd(), pc.getHdPrice(), pc.getMonitor(), pc.getMonitorPrice());
        System.out.printf("\n\nFinal Price: R$%.2f", pc.priceCalculator());
        sc.close();
    }
}