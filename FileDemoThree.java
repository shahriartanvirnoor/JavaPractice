import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileDemoThree {
    public static void main(String args[]) {
     try{  FileWriter fw = new FileWriter("TextFileOne.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String line = "Checking if it is working or not.";
        bw.write(line);
        bw.close();
        fw.close();
    } catch(IOException ie) {
        System.out.println("Error in the code");
        System.out.println(ie);
    } finally {
        System.out.println("Program Terminates here.");
    }
    
    }
}

/* এই প্রোগ্রামে আমি ফাইল ওপেন করে তার মধ্যে লিখছি। এর জন্য আমি BufferedWriter এর সাহায্য নিছি। আগে একটা প্রোগ্রাম করছিলাম যেখানে আগে Buffer ক্লোস করছি যার কারণে এরর দেখাইছে।
এখনের টাতে আগে বাফার ক্লোস করেছি তার পরে ফাইল ক্লোস করেছি।
* তো এই প্রোগ্রামটা সাধারণ একটা ডেমোন্সট্রেশন। জটিল কিছু ব্যবহার করা হয়নাই। বাফারে শুধু ফাইলের অবজেক্ট টা দিয়ে দেওয়া হয়েছে। আর কিছু না। বাফার কে যে আরো ডিটেইলসে ব্যবহার করা যায় তা আমি
এখানে দেখাই নাই। এইটা হচ্ছে পরবর্তী ধাপ। আরো মডিফাই করে কিভাবে ব্যবহার করতে পারি। 
* এখন যেহেতু ফাইল আর বাফার এর কাজটা দেখে নিলাম, তাই দেরি না করে ফাইলের যাবতীয় কিছু এখনি একেবারে শিখে নিতে হবে। মানে এখনি বলতে দুয়েকদিনের মধ্যে। কারণ গরম গরম খাবারের স্বাদ
ভিন্ন।
*/
