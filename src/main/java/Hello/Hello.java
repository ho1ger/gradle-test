package Hello;
import org.joda.time.LocalTime;

public class Hello{

    private String text;

    public Hello(String text) {
        this.text = text;
    }

    public Hello() {
    }

    private String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void doGreet(){
        String tmp = this.getText();
        if (tmp != null){
            System.out.println(tmp);
        }
        else{
            System.out.println("No greating for you.");
        }

    }

    public void tellTime(){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
    }

}
