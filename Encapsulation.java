class Student{
    private int rollNumber;
    private String name;
    private int semester;
    public void setRollNumber(int r){
        this.rollNumber=r;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void setSemester(int s){
        if(s<0)System.out.println("Semester can not be negative");
        else this.semester=s;
    }
    public int getSemester(){
        return semester;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Student s=new Student();
        s.setRollNumber(50);
        s.setName("Fida Hussain Wani");
        s.setSemester(6);
        System.out.println("Roll Number: "+ s.getRollNumber());
        System.out.println("Name: "+ s.getName());
        System.out.println("Semester: "+ s.getSemester());
    }
}