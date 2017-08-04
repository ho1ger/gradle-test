package Hello;
import org.joda.time.LocalTime;

public class Hello{

    private String text;

    public Hello(String text) {
        this.text = text;
    }

    public Hello() {}

    private String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String doGreet(){
        String tmp = this.getText();
        if (tmp != null){
            return tmp;
        }
        else{
            return "No greating for you.";
        }
    }

    private LocalTime getTime(){
        return new LocalTime();
    }

    public String tellTime(){
        LocalTime time = getTime();
        return "The current local time is: " + time;
    }

}
