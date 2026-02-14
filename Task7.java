class Demo2{
    static int a,b,c;
    int x,y,z;
    static{
        System.out.println("Static block values initialization.");
        a=20;
        b=30;
        c=40;
    }
    static void display(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("values are printed.");

    }
    {
        System.out.println("instance block is started to initialized.");
        x=10;
        y=11;
        z=12;
    }
    void display2(){
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
        
      
    }
   public Demo2(){
    System.out.println("Demo2 bean is created.");

    }
}

public class Task7 {
    public static void main(String[] args) {
        Demo2.display();
        Demo2 demo2=new Demo2();
        demo2.display2();

        
    }
    
}
