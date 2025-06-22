

public class student
{
    private int rollNo;
    private String Name;
    private int age;

    public student()
    {
        rollNo=0;
        Name=null;
        age=0;
    }

    public student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        Name = name;
        this.age = age;
    }

    public int getrollNo(){
        return rollNo;
    }

    public void setrollNo(int roll){
        this.rollNo=roll;
    }

    public String getName(){
        return Name;
    }

    public void setName(String nm){
        Name=nm;
    }

    public int getage(){
        return age;
    }

    public void setage(int age)
    {
        this.age=age;
    }
}
