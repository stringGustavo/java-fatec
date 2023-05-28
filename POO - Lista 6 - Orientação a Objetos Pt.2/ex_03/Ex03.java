public class Ex03 {

    //Gustavo Sant'Anna dos Santos;

    public static void main(String[] args) {
        //Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400.;

        Year year = new Year();

        year.setYear(2024);

        if(year.isLeapYear()) {
            System.out.printf("Year: %d, is a leap year!", year.getYear());
        } else {
            System.out.printf("Year: %d, isn't a leap year!", year.getYear());
        }
    }
}
