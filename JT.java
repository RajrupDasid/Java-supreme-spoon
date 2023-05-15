//java type casting
//typecasting or wending casting
//Widening casting is done automatically when passing a smaller size type to a larger size type

public class JT{
  public static void main(String[] args){
    int myInt = 6;
    double dInt = myInt;
    System.out.println(myInt);
    System.out.println(dInt);
    mystring();
  
  }
  public static String mystring(){
    String myChar = "static implies that main is method of class it self not a part of class instances";
    System.out.println(myChar);
    return myChar;
  }
}