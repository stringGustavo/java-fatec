import java.util.Scanner;

public class Ex01 {

    //Gustavo Sant'Anna dos Santos;
    public static void main(String[] args) {
        //Criar uma classe para representar uma Pessoa. A pessoa tem como características o nome, em formato String, a idade, em números inteiros e a altura, que pode ter casas decimais. Além dos métodos assessores de cada característica, temos um método que recebe como parâmetro de entrada um valor lógico, que quando verdadeiro, incrementa em um a idade da pessoa e esse método deve ser chamado por fazAniversario, não havendo retorno. Siga o diagrama abaixo para implementar a classe Pessoa. Após crie uma classe para testar. Observe os sinais de mais e de menos antes dos nomes dos atributos e métodos. Respeite-os!;

        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        char option;
        boolean birth;

        do {
            System.out.print("Today is your birthday? [Y/N]: ");
            option = scan.next().toLowerCase().charAt(0);
        } while (option != 's' && option != 'n' && option != 'y');

        scan.close();

        
        person.setName("Gustavo Santos");
        person.setAge(26);
        person.setHeight(1.69);
        
        if(option == 'y' || option == 's') {
            birth = true;
            person.birthday (birth);
        }

        System.out.println("\nName: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Height: " + person.getHeight());
    }
}
