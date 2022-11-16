package oops;
class A
{
   void aInfo()
   {
       System.out.println("from class A");
   }
}
class B
{
    void bInfo()
    {
        System.out.println("from class B");
    }
}
public class ObjectTest {
    public static void main(String[] args) {
         A a=new A();//object of class A
         a.aInfo();

         B b=new B();//object of class B
         b.bInfo();

    }
}
