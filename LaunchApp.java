import java.util.*;
class Farmer{
    float pa;
    float td;
   static float roi;
    float si;
    static{
        roi=2.5f;
    }
    public void acceptance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Kindly Enter PA in ruppes: ");
        pa=sc.nextFloat();
        System.out.println("Kindly Enter TD in months: ");
        td=sc.nextFloat();
        
    
    }
    public void compute(){
        si=(pa*roi*td)/100.0f;
    }
    public void display(){
        System.out.println("Your SI is : "+si);
    }

}

public class LaunchApp {
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        System.out.println("Farmer 1 details: ");
        f1.acceptance();
        f1.compute();
        f1.display();
        Farmer f2=new Farmer();
        System.out.println("Farmer 2 details: ");
        f2.acceptance();
        f2.compute();
        f2.display();
        Farmer f3=new Farmer();
        System.out.println("Farmer 3 details: ");
        f3.acceptance();
        f3.compute();
        f3.display();

        
    }
    
}
