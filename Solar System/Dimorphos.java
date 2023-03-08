public class Dimorphos extends Asteroid{
    
    String darted;

    public Dimorphos(double diameter, String beeg, boolean inBelt, String madeOf, String darted){
        super(diameter, beeg, inBelt, madeOf);
        this.darted = darted;
    }

    public void speak(){
        System.out.println("me durmph");
    }

    public String getDarted(){
        return darted;
    }

    public void fatality(){
        System.out.println("FATALITY: NASA WINS");
    }
}
