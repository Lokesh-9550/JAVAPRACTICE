class  Demo{
    int num1,num2;
    Demo(){
        super();
        System.out.println("Zero param constructor.");
    }
    Demo(int num1,int num2){
        this(num1);
        this.num1=num1;
        this.num2=num2;
        System.out.println("two param constructor.");
    }
    Demo(int num1){
        this();
        this.num1=num1;
        num2=44;
        System.out.println("one param constructor.");
    }
   void display(){
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Demo demo=new Demo(21);
        demo.display();
        System.out.println("************************");
        Demo demo2=new Demo(4,5);
        demo2.display();

    }
    
}
