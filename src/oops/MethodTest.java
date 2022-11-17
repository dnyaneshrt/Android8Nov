package oops;

public class MethodTest {
   public int roll=666;//instance variable
    static int roll2=999;//static variable

   //instance method(non-static method)
    void display()
    {
        System.out.println("i am from instance method display");
    }
    //static method
    static void info()
    {
        System.out.println("i am from static method info");
    }
    public static void main(String[] args) {
        MethodTest m1=new MethodTest();
        m1.display();
        System.out.println(m1.roll);

        MethodTest.info();//calling static method
        System.out.println(MethodTest.roll2);
    }
}
