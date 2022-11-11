package basicPrograms;

public class LeapYear {
    public static void main(String[] args) {
        int year=2016;//if year is divisible by 4 us leap year
       /* if(year%4==0)
        {
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not leap year");
        }*/
        System.out.println((year%4==0)?"even":"odd");
    }
}
