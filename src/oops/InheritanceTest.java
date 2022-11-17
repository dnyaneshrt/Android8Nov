package oops;

class Parent
{
    void parent()
    {
        System.out.println("from parent class");
    }
}
class Child extends Parent
{
    void child()
    {
        System.out.println("from Child class");
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
//      Parent p=new Parent();
//      p.parent();

      Child c=new Child();
      c.child();
      c.parent();

        System.out.println("roll2 value from anather class: "+MethodTest.roll2);
        MethodTest m1=new MethodTest();
        System.out.println("roll from MethodTest "+m1.roll);
        m1.display();




    }
}
