package clinic.programming.training;


import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils; 


public class Application {
	
    public Application() {
        System.out.println ("Inside Application");
    }
    
    public int countWords(String w) {
    	String[] sW = StringUtils.split(w, ' ');
    	return (sW == null) ? 0:sW.length;
    }
    
    public void greet() {
    	List<String> greeting = new ArrayList<>();
    	greeting.add("Hello");
    	
    	for (String greetings : greeting) {
    		System.out.println("Greeting :" + greetings);
    	}
    }
	
    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println(count);
    	System.out.println("Hi");
    }
}
