package work;
import java.util.Scanner;
public class work {
    public static void main(String[] args) {
        Scanner bg = new Scanner(System.in);
        int w, l, vw;
        System.out.println("Mention the weight: ");
        w = bg.nextInt();
        System.out.println("Mention the length: ");
        l = bg.nextInt();
        vw = w * l;
        System.out.println("Your VW is: " + vw);
    }
}