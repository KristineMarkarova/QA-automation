package work;

public class PersonInfo {
    public String personsName;
    public int personsAge;
    public String personsPosition;

    public void companyName() {
        System.out.println("Company name is \"Milan\"");
    }
    public PersonInfo(){}
    public PersonInfo(String name, int age, String position){
        personsName = name;
        personsAge = age;
        personsPosition = position;
    }


}
