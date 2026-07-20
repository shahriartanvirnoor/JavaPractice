class A extends Thread {
    void method1(){
        for(int i=1; i<=100; ++i) {
        System.out.println("Method 1 is running" +i);
    }
}

    void method2() {
        for(int i=1; i<=100; i++){
        System.out.println("Method 2 is running"+i);
        }
    }
    int task;
    A(int task) {
        this.task = task;
    }
    @Override
    public void run(){
        if(task==1)
            method1();
        else method2();
    }

    // public void run() {
    //     for(int i=2; i<=100; ++i){
    //         if(i%2==0){
    //             System.out.println(" "+ i+" ");
    //         }
    //         else if()
    //     }
    // }
    
}
public class Concurrent {
    

    public static void main(String[] args) {

        A thread1 = new A(1);
        A thread2 = new A(2);
        thread1.start();
        thread2.start();
        
    }
}
/*
    * আমাকে একটা ক্লাস থেকে ২টা রান মেথোড কল করতে হবে।
    * মানে ২টা আলাদা ফাংশন রান করতে হবে 
    * কি করা যেতে পারে? */
