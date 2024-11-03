import java.util.Scanner;
import java.time.LocalTime;

public class HelloWorld {

     public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.displayProject();
        helloWorld.displayTime();
       
    }
    public void displayProject() {
        System.out.println("Hello, World!");
        System.out.println("This is some test code for skills module");
    }
     public void displayTime() {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
    }

}
