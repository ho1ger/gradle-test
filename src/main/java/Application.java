import Hello.Hello;

public class Application{

  public static void main(String [] args){
     Hello hello = new Hello();
     System.out.println(hello.doGreet());
     hello.setText("Hell oh World");
     System.out.println(hello.doGreet());
     System.out.println(hello.tellTime());
  }

}