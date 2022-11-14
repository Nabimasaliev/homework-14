public class Dancer extends  Person{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName=groupName;
    }

    @Override
    public void learn() {
        System.out.println("Dancer can learn dance in 2 years. ");
    }

    @Override
    public void walk() {
        System.out.println("Dancer walks with his partner road the street.");
    }

    @Override
    public void eat() {
        System.out.println("Dancer doesn't eat  a lot of meal.");
    }
    public void dancing(){
        System.out.println("Dancer will dance in the park today afternoon.");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                " Name= '"+getName()+'\''+
                " Designation= '"+getDesignation()+'\''+
                " Group name= '" + groupName + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        learn();
        walk();
        eat();
        dancing();
        return null;
    }
}
