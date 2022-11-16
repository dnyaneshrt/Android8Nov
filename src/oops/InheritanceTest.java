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

    }
}
