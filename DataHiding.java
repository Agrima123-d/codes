class Rectangle{
    private double length;
    private double breadth;
public double getLength()
{
    return length;
}
public double getBreadth()
{
    return breadth;
}
public void setLength(double l)
{
    if (l>=0)
     length=l;
    else 
    length=0;
}
public void setBreadth(double b)
{
    if (b>=0)
     breadth=b;
    else 
    breadth=0;
}

public double area()
{
    return getLength()*getBreadth();
}
public double perimeter()
{
    return 2*(getLength()+getBreadth());
}
public boolean isSquare()
{
    return getLength()==getBreadth();
}
}
class DataHiding{
public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.setLength(5.8);
r1.setBreadth(6.7);
System.out.println("Area is : "+r1.area());
System.out.println("Perimeter is: "+r1.perimeter());
System.out.println("IsSquare: "+r1.isSquare());
}


}