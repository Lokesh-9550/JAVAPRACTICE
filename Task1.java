class Multi{
    int mult(int a,int b){
        return a*b;
    }
    int mult(int a, int b,int c){
        return a*b*c;
    }
    double mult(double a,double b){
        return a*b;
    }
}


public class Task1{
    public static void main(String[] args) {
        Multi m=new Multi();
       System.out.println( m.mult(12.23, 34.45));
       System.out.println( m.mult(12, 12));
        System.out.println(m.mult(1,2,3 ));
    }

}