public class Neptune extends Planet{

    String god;

    public Neptune(double diameter, String beeg, int moons, boolean water, String god){
        super(diameter, beeg, moons, water);
        this.god = god;
    }

    public void speak(){
        System.out.println("me numpty");
    }

    public String getGod(){
        return god;
    }

    public void blue(){
        System.out.println("i'm blue (da ba dee)");
    }
}