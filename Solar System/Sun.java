public class Sun extends SolarSystem{
    
    boolean bright;
    String skin;

    public Sun(double diameter, String beeg, boolean bright, String skin){
        super(diameter, beeg);
        this.bright = bright;
        this.skin = skin;
    }

    public void speak(){
        System.out.println("i'm a sun");
    }

    public boolean getBright(){
        return bright;
    }

    public String getSkin(){
        return skin;
    }

}
