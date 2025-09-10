package assigm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemonstratesBufferedReader {
	    public static void main(String[] args) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            System.out.print("Enter your name: ");
	            String name = reader.readLine();

	            System.out.print("Enter your age: ");
	            String ageInput = reader.readLine();
	            int age = Integer.parseInt(ageInput);

	            System.out.println("Hello, " + name + "! You are " + age + " years old.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while reading input.");
	        } catch (NumberFormatException e) {
	            System.out.println("Please enter a valid number for age.");
	        }
	    }
	}
