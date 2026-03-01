class Student{
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;

    public long total()
    {
        return m1+m2+m3;
    }
    
    public double average()
    {
        return (double)total()/3;
    }

   public char grade()
    {
        if (average()>=60)
        return 'A';
        else if(average()>=50)
        return 'B';
        else if(average()>=40)
        return 'C';
        else 
        return 'D';
    }}

class StudentDetails{
    public static void main(String args[]){
        Student s1= new Student();
        s1.rollNo=7;
        s1.name="Agrima";
        s1.course="Betch";
        s1.m1=67;
        s1.m2=78;
        s1.m3=90;
        System.out.println("Grade: "+s1.grade());
        System.out.println("Total: "+s1.total());
        System.out.println("AverageMarks: "+s1.average());
    }
}

