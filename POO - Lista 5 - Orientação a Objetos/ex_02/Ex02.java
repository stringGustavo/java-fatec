import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {
        //Imagine o problema de sair com os amigos para uma refeição em um restaurante e ao final ter que dividir a conta para cada pessoa. Outra coisa importante, os 10% do garçom é opcional. Criar uma classe para solucionar o problema proposto, onde tem o valor da conta a ser paga (sem os 10% do garçom), a quantidade de pessoas que dividirão essa conta e se vai ser pago os 10% do garçom, sim ou não. Valide os dados inseridos não permitindo absurdos.

        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();

        char option;

        bill.setValue(320.56);
        bill.setFriends(5);
        bill.setWaiterTip(1.1);

        do {
            System.out.print("Do you like to pay the waiter's 10%? [Y/N]:");
            option = sc.next().toUpperCase().charAt(0);
        } while(option != 'Y' && option != 'N');

        System.out.printf("\nBill value: R$%.2f", bill.getValue());
        System.out.printf("\nNumber of Friends: %d", bill.getFriends());
        
        if(option == 'Y') {
            System.out.printf("\nEach one will pay: R$%.2f", bill.billDivide() * bill.getWaiterTip());
        } else {
            System.out.printf("\nEach one will pay: R$%.2f",bill.billDivide());
        }
    }
}
