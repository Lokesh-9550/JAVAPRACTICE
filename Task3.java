class Employee{
    private int id;
    private String name;
   void setId(int i){
        id=i;

    }
    void setName(String n){
        name=n;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
    
}
