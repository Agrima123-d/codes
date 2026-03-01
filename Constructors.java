 class Rectangle{
    private double length;
    private double breadth;
 public Rectangle()
    {
        length=1;
        breadth=1;
    }
public Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
    }
 double area()
 {
    return length*breadth;
 }
 double perimeter()
 {
    return 2*(length+breadth);
 }
boolean isSquare()
{
    return length==breadth;
}
}
class Constructors {
    public static void main(String args[]){
        Rectangle r= new Rectangle();
        System.out.println("Area is: "+r.area());
         System.out.println("Perimeter is: "+r.perimeter());
          System.out.println("Is it a square: "+r.isSquare());
    
     Rectangle r1= new Rectangle(10,5);
        System.out.println("Area is: "+r1.area());
         System.out.println("Perimeter is: "+r1.perimeter());
          System.out.println("Is it a square: "+r1.isSquare());

    }

}