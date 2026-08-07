import java.util.*;

public class HackerRankFour {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        String s = scanner.nextLine();
        double d = scanner.nextDouble();
       // System.out.println("String: " + s);
        System.out.println("Int: " + a);
        System.out.println("Double: " + d);
    
    }
}
/* 
 *When I run this program and it wants input from me and I type first integer then String and tap enter it shows something like
 *89
kdka
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:977)
        at java.base/java.util.Scanner.next(Scanner.java:1632)
        at java.base/java.util.Scanner.nextDouble(Scanner.java:2603)
        at HackerRankFour.main(HackerRankFour.java:9)
*the reason behind this error is when we take stirng input between two number type data it don't remove the leftover '\n' and that cause this problem.
* How can we solve it? There is one way and that is to keep that data into another scanner.nextLine(); it just remove that leftover '\n'
* Things are different when we just took number one after another. java autometically remove any whitespace and '\n'. And If we add after string, string consume that new 
line character. So, for the first one we need to use that method..
Date: 07-aug-2026
author: Shahriar
*/
