package work;
import java.util.Collections;

public class Person {
    public static void main(String[] args) {
        PersonInfo player = new PersonInfo("Ibraimovich", 39, "Striker");
        player.companyName();
        System.out.println("1. Player's name is: " + player.personsName + ", age is: " + player.personsAge + ", and position is: " + player.personsPosition);

        PersonInfo player1 = new PersonInfo("Mario", 34, "Forward");
        System.out.println("2. Player's name is: " + player1.personsName + ", age is: " + player1.personsAge + ", and position is: " + player1.personsPosition);

        PersonInfo player2 = new PersonInfo("Ante", 27, "Winger");
        System.out.println("3. Player's name is: " + player2.personsName + ", age is: " + player2.personsAge + ", and position is: " + player2.personsPosition);

        PersonInfo player3 = new PersonInfo("Alessio", 26, "Centre back");
        System.out.println("4. Player's name is: " + player3.personsName + ", age is: " + player3.personsAge + ", and position is: " + player3.personsPosition);

        PersonInfo player4 = new PersonInfo("Gianluigi", 22, "Goalkeeper");
        System.out.println("5. Player's name is: " + player4.personsName + ", age is: " + player4.personsAge + ", and position is: " + player4.personsPosition);

        PersonInfo player5 = new PersonInfo("Matteo", 21, "Defender");
        System.out.println("6. Player's name is: " + player5.personsName + ", age is: " + player5.personsAge + ", and position is: " + player5.personsPosition);
{


 }



    }

}