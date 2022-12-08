import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);


        System.out.println("What's your name?");
        person.setName(scanner.nextLine());

        System.out.println("And your surname?");
        person.setSurname(scanner.nextLine());


        System.out.println("How old are you?");
        person.setAge(scanner.nextInt());


        System.out.println("How tall are you?");
        person.setHeight((scanner.nextDouble()));


        person.printDetails();


    }


}
