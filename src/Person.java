public class Person {
    private String name;
    private  String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void  learn(){
        System.out.println("Person will learn a new skill.");
    }
    public  void walk(){
        System.out.println("Person walks road the street with partner.");
    }
    public void eat(){
        System.out.println("Person eats meal  every day.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getInfo(){
        Person.super.toString();
        learn();
        walk();
        eat();
        return "";
    }

}
