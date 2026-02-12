class Dog{
    private int cost;
    private String name;
    private String colour;
    Dog(int cost, String name,String colour){
        this.cost=cost;
        this.name=name;
        this.colour=colour;

    }
    void setCost(int cost){
        this.cost=cost;
    }
    void setName(String name){
        this.name=name;
    }
    void setColour(String colour){
        this.colour=colour;
    }
    int getCost(){
        return cost;
    }
    String getName(){
        return name;
    }
    String getColour(){
        return colour;
    }

}

public class Task4 {
    public static void main(String[] args) {
        Dog dog=new Dog(4, "Rocky", "white");
        System.out.println(dog.getCost());
        System.out.println(dog.getName());
        System.out.println(dog.getColour());
    }
    
}
