public class Programmer extends Person{
    private  String nameCompany;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
    public Programmer(String name, String designation, String nameCompany) {
        super(name, designation);
        this.nameCompany=nameCompany;
    }



    @Override
    public void learn() {
        System.out.println("Programmer learns programming language Java.");
    }

    @Override
    public void walk() {
        System.out.println("Programmer will walk many times single.");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eats a lot of seafoods");
    }
    public  void coding(){
        System.out.println("Programmers like hard worker people, they every day will write cody on 4-5 hours. ");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                " Name= '"+getName()+'\''
                +" Designation= '"+getDesignation()+'\''
                + " Name Company= '" + nameCompany + '\'' +
                '}';
    }
    public String getInfo(){
        Programmer.super.toString();
        learn();
        walk();
        eat();
        coding();

        return null;
    }
}