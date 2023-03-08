public class Main{

    public static void main(String[] args){

        Sun tzu = new Sun(865370, "beeg", true, "cancer");
        Earth earf = new Earth(7917.5, "beeg", 1, true ,true);
        Neptune numpt = new Neptune(30599, "beeg", 14, true, "Poseidon");
        Dimorphos durmph = new Dimorphos(0.10563, "beeg", false, "chondrite", "yes");

        System.out.println();
        tzu.speak();
        System.out.println(tzu.getSkin());
        System.out.println(tzu.getBright());
        System.out.println(tzu.getDiameter());
        System.out.println(tzu.getBeeg());
        System.out.println();

        earf.speak();
        earf.globalWarming();
        System.out.println(earf.getLife());
        System.out.println(earf.getLife());
        System.out.println(earf.getMoons());
        System.out.println(earf.getWater());
        System.out.println(earf.getDiameter());
        System.out.println(earf.getBeeg());
        System.out.println();

        numpt.speak();
        numpt.blue();
        System.out.println(numpt.getGod());
        System.out.println(numpt.getMoons());
        System.out.println(numpt.getWater());
        System.out.println(numpt.getDiameter());
        System.out.println(numpt.getBeeg());
        System.out.println();

        durmph.speak();
        durmph.fatality();
        System.out.println(durmph.getDarted());
        System.out.println(durmph.getBelt());
        System.out.println(durmph.getMadeOf());
        System.out.println(durmph.getDiameter());
        System.out.println(durmph.getBeeg());
        System.out.println();

    }
}