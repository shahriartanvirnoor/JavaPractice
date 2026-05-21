public class Check1 {
     static int x;
    public static void main(String[] args)
    {
       String x = "hello";
       String y = new String("hello");
       String k = new String("hello");
       boolean z = k==y;
       String f = "hi";
       boolean m = x==y;//they are comparing the reference of two variable.
       System.out.println("Truth value of z : " + z);//false
       System.out.println("Truth value of m : " + m);//false
       System.out.println("The camparison result is :" + (x==f));//false
    }
}
