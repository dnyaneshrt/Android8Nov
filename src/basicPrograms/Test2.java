package basicPrograms;

public class Test2 {
    public static void main(String[] args) {
        //every statement must be end with semi colon.
      int number1=50;//variable initialization
      int number2=20;

      System.out.println("hello welcome");
      System.out.println("number 1:"+number1);
      System.out.println("number 2:"+number2);

      //Arithmetic opearators
        System.out.println("addition of above two numbers are :"+(number1+number2));
        System.out.println("substarction of above two numbers are :"+(number1-number2));
        System.out.println("multiplication of above two numbers are :"+(number1*number2));
        System.out.println("divison of above two numbers are :"+(number1/number2));

        int age=20;
        boolean check=false;
        
        if(age>18)
            check=true;
        else
            check=false;

        if(check)
            System.out.println("u can vote");
        else
            System.out.println("cannot vote, go and play");

    }
}
