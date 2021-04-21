package work;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.println("the number of hours worked: ");
        int worktime = work.nextInt();
        System.out.println("Worktime is: " + worktime);
        int salary = work.nextInt();
        System.out.println("Salary is: " + salary);
        int togeter = worktime+salary;
        System.out.println("Togeter is: " + togeter);



    }
}
