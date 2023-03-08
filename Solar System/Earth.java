public class Earth extends Planet{
    
    boolean life;

    public Earth(double diameter, String beeg, int moons, boolean water, boolean life){
        super(diameter, beeg, moons, water);
        this.life = life;
    }

    public void speak(){
        System.out.println("me earf");
    }

    public boolean getLife(){
        return life;
    }

    public void globalWarming(){
        System.out.println(":(");
    }

}
