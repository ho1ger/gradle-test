import Hello.Hello;

public class Application{

  public static void main(String [] args){
     Hello hello = new Hello();
     hello.doGreet();
     hello.setText("Hell oh World");
     hello.doGreet();
     hello.tellTime();
  }

}