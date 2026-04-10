class student{
    String name;
    int age;
    student(){
        this.name= "Unknown";//if use this constructor it will say name = Unknown and age = 0;
        this.age = 0;
    }
    student(String n){
        this.name=n;
        this.age=0;
    }
    student(String n, int a){
        this.name = n;
        this.age = a;

    }
}
public class studentfirst{
    public static void main(String[] args){
        student s1= new student();

        student s2 = new student("Shaharia");

        student s3 = new student("Shahria", 21);

        System.out.println(s3);// it will show us the location of object s3

        System.out.println(s3.name+" "+ s3.age +" ");
        System.out.println(s1.name+" "+ s1.age +" ");
    }
}
/*একটা কথা মনে রাখতে হবে যে মেইন ক্লাসের নাম অনুযায়ী জাভা ফাইলের নাম রাখতে হবে। অবজেক্ট ফাইলের নাম
অনুযায়ী ইন্সট্যান্সের অব্জেক্ট কল করতে হবে*/
