import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.List;
import java.util.stream.*;
import java.util.function.Function;
public class newoneforme {
    public static void main(String[] args) {
        int y = 11;
        int f = 11;
        int firstone;
        int secondone;
        boolean thirdone;

        firstone = countIt(y);
        System.out.print("It's " + firstone);
        secondone = addThat(y, f);
        System.out.print("\nIt's " + secondone);
        thirdone = numEk(y, f);
        System.out.print("\nIt's " + thirdone);
    }
    public static int countIt(int x)
    {
        return(x * 100);
    }
    public static int addThat(int a, int b)
    {
        return (a-b);
   }

        public static boolean numEk(int ff, int zz){
        if (ff == zz) return true;
        else return false;}


    }

