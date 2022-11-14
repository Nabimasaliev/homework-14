public class Singer extends Person{
    private String bandName;


    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName=bandName;

    }

    @Override
    public void learn() {
        System.out.println("Singer learn sing a song every day in his room.");
    }

    @Override
    public void walk() {
        System.out.println("Singer cannot walk in the park freedomly.");
    }

    @Override
    public void eat() {
        System.out.println("Singer eats same the foods with dancer I think.");
    }
    public void singing(){
        System.out.println("Singer will sing a song very popular music.");
    }
    public void playGuitar(){
        System.out.println("At the same time singer playing the guitar.");
    }
    @Override
    public String toString() {
        return "Singer{" +
                " Name= '"+getName()+'\''+
                " Designation= '"+getDesignation()+'\''+
                " Band name= '" + bandName + '\'' +
                '}';
    }
    public String getInfo(){
      learn();
      walk();
      eat();
      singing();
      playGuitar();
        return null;
    }
}
