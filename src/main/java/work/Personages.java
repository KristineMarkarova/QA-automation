package work;

public class Personages {
    public static void main(String[] args) {
        Personage personage1 = new Personage();
        personage1.name = "Saakh";
        personage1.setName("Demon");
        personage1.age = 120;
        personage1.height = 3.45;
        personage1.weight = 236;
        personage1.smart = false;
        personage1.setVip("Vip: No");
        personage1.setGeneral("General access set!");
        System.out.println("" + personage1.getVip());
        personage1.speak();
        System.out.println();

        Personage personage2 = new Personage();
        personage2.name = "Metlak";
        personage1.setName("Bist");
        personage2.age = 350;
        personage2.height = 0.45;
        personage2.weight = 39;
        personage2.smart = false;
        personage2.setVip("Vip? Yes");
        personage2.setGeneral("General: No");
        System.out.println("" + personage2.getGeneral());
        personage2.speak();
        System.out.println();

        Personage personage3 = new Personage();
        personage3.name = "Lorin";
        personage1.setName("Hunter");
        personage3.age = 40;
        personage3.height = 1.95;
        personage3.weight = 39;
        personage3.smart = true;
        personage3.setVip("Vip? Yes");
        personage3.setGeneral("General: No");
        System.out.println("" + personage3.getGeneral());
        personage3.speak();
        System.out.println();

        int year1 = personage1.prof();
        int year2 = personage2.prof();
        int year3 = personage3.prof();
        System.out.println("Years to prof: " + year1);
        System.out.println("Years to prof: " + year2);
        System.out.println("Years to prof: " + year3);


    }
}

class Personage {
    public String name;
    public String alterEgo;
    public int age;
    public double height;
    public int weight;
    public boolean smart;

    private String vip;
    private String general;

    public void setVip(String vipAccsess) {
        vip = vipAccsess;
    }

    public String getVip() {
        return vip;
    }

    public void setGeneral(String generalNoVipAccess) {
        general = generalNoVipAccess;
    }

    public String getGeneral() {
        return general;
    }

    int prof() {
        int years = 500 - age;
        return years;
    }

    void speak() {
        System.out.println("Personage name is " + name + ", and the alter ego is: " + alterEgo);
        System.out.println("Do you have access to VIP? " + vip);
        System.out.println(general);
        System.out.println("Personage age is " + age);
        System.out.println("Is the personage smart? \nThe answer is: " + smart);
    }

    void setName(String alterEgoName) {
        alterEgo = alterEgoName;


    }
}