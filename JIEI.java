//java if else if conditional tree

public class JIEI{
    public static void main(String[] args){
       int a = 15;
       int b = 16;
       int c = 19;
       if(a>=b && a>=c){
            System.out.println("A is greater than both a and b");
       }else if(b>=a && b>=c){
            System.out.println("B is greater than both a and c ");
        }else{
            System.out.println("C is greater than both a and b");
        }
    }
}