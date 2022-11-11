package basicPrograms;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("****area of circle*******");
        //PI*r*r
        int radious=5;
        double PI=3.14;
        double area=PI*radious*radious;//3.14*5*5
        System.out.println("area of given circle is: "+area);

        System.out.println("****area of Square*******");
        //PI*r*r
        int side=5;
        int s_area=side*side;
        System.out.println("area of given Square is: "+s_area);

        System.out.println("****area of Triangle*******");
        int breadth=5;
        int height=5;
        double t_area=0.5*height*breadth;
        System.out.println("area of triangle :"+t_area);

    }
}
