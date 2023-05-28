public class Ex04 {
    public static void main (String[] args ) {
        //Elabore um programa em java que contenha um método que aceite um valor inteiro e retorne o número com os dígitos invertidos. O valor deve ser solicitado ao usuário.

        Number number = new Number();

        number.setNumber(-4892);

        System.out.println(number.getNumber() + " | " + number.reverseNumber());
    }
}
