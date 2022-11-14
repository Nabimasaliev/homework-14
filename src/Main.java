import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Person person=new Person("Person", "alive");
        System.out.println(person.toString());
        person.getInfo();
        System.out.println("-----------------------------------------------------------");

        Programmer programmer = new Programmer("Nabi", "Senior", "Apple");
        System.out.println(programmer.toString());
        programmer.getInfo();
        System.out.println("----------------------------------------------------------");

        Dancer dancer = new Dancer("Albina", "professional dancer", "girl's club");
        System.out.println(dancer.toString());
        dancer.getInfo();
        System.out.println("---------------------------------------------------------");

        Singer singer=new Singer("Mirbek","Singer","Group-312");
        System.out.println(singer.toString());
        singer.getInfo();

    }
}