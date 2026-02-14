class Student{
    int id;
    String name;
    String city;
    static int count;

    {
        System.out.println("hi");
        count++;
    }
    public Student(){
        System.out.println("zero param constructor.");
    }
    public Student(int id, String name,String city){
        System.out.println("parametarized constructor.");
        this.id=id;
        this.name=name;
        this.city=city;
        
    }

}
public class Task8 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Lokesh","Nellore");
        System.out.println("count: "+Student.count);
        Student s2=new Student(2,"Mohiddin","Nellore");
        System.out.println("count: "+Student.count);
        Student s3=new Student(3,"Uday","Nellore");
        System.out.println("count: "+Student.count);
        
    }
    
}
