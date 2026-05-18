import java.util.Scanner;
public class Check {
    public static void main(String[] args)
    {
        Scanner message = new Scanner(System.in);
        String m = "Welcome!";
        String m1 = "Welcome!";
        boolean b = (m1==m);
       String m2 = new String("Welcome!");
       boolean b1 = (m1==m2);
        System.out.println("Boolean value comparison between m and m1 variable : "+ b);
       System.out.println("Boolean value comparison between m2 and m1 variable : "+ b1);
    }
    
}
