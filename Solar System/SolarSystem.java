public class SolarSystem {
    
    double diameter;
    String beeg;

    public SolarSystem(double diameter, String beeg){
        this.diameter = diameter;
        this.beeg = beeg;
    }

    public void speak(){
        System.out.println("i'm a solar system");
    }

    public double getDiameter(){
        return diameter;
    }

    public String getBeeg(){
        return beeg;
    }

}
