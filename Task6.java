class Finishers{
    private int age;
    private String name;
    private String city;
    Finishers(){
        System.out.println("zero param constructor.");
    }
    Finishers(int age, String name, String city){
        this.age=age;
        this.name=name;
        this.city=city;
        System.out.println("parametarized constructor.");
    }
    void setAge(int age){
        this.age=age;
    }
    void setName(String name){
        this.name=name;

    }
    void setCity(String city){
        this.city=city;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }
    String getCity(){
        return city;
    }


}

public class Task6 {

    public static void main(String[] args) {
        Finishers f1=new Finishers();
        f1.setAge(23);
        f1.setName("Lokesh");
        f1.setCity("Nellore");
        System.out.println(f1.getAge());
        System.out.println(f1.getName());
        System.out.println(f1.getCity());
        System.out.println("*************************");
        Finishers f2=new Finishers(22,"Mohiddin","Nellore");
        f2.setAge(23);
        f2.setName("uday");
        f2.setCity("Nellore");
        System.out.println(f2.getAge());
        System.out.println(f2.getName());
        System.out.println(f2.getCity());
        
    }
}
