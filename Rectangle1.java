class Rectangle
{
    public int length;
    public int breadth;
    public boolean isSquare()
    {
        return length==breadth;
    }

public double area()
{
    return length*breadth;
}
public double perimeter()
{
    return 2*(length+breadth);
}
}
class Rectangle1{
public static void main(String args[])
{
    Rectangle r1=new Rectangle();
    r1.length=5;
    r1.breadth=7;
    System.out.println("Area: "+r1.area());
     System.out.println("Perimeter: "+r1.perimeter());
     System.out.println("Is it a sqaure: "+r1.isSquare());
    

}

}