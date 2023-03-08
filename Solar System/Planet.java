public class Planet extends SolarSystem{
    
    int moons;
    boolean water;

    public Planet(double diameter, String beeg, int moons, boolean water){
        super(diameter, beeg);
        this.moons = moons;
        this.water = water;
    }


    public void speak(){
        System.out.println("i'm a planet");
    }

    public int getMoons(){
        return moons;
    }

    public boolean getWater(){
        return water;
    }

}
