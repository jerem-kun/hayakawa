public class Asteroid extends SolarSystem{

    boolean inBelt;
    String madeOf;

    public Asteroid(double diameter, String beeg, boolean inBelt, String madeOf){
        super(diameter, beeg);
        this.inBelt = inBelt;
        this.madeOf = madeOf;
    }


    public void speak(){
        System.out.println("i'm an asteroid");
    }

    public boolean getBelt(){
        return inBelt;
    }

    public String getMadeOf(){
        return madeOf;
    }


}