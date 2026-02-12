class Book{
    int pageNum;

    void setPageNumber(int pgNum){
        if(pgNum>=0){
            pageNum=pgNum;
        }
        else{
            System.out.println("Kindly check the datils..");
        }
    }
    void display(){
        System.out.println("the book details and page number is display in bellow "+pageNum);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Book book=new Book();
        book.setPageNumber(-4);
        book.display();
    }
    
}
