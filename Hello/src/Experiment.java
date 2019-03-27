import java.io.*;
import java.util.*;

public class Experiment {

	// Formatter
	private PrintWriter x;  // 9. - private - public

	//open stream
	public void openFile() {
		try {
			x = new PrintWriter(new FileWriter("yo.txt",true));
		} catch (Exception e) {
			System.out.printf("Error: %s \n", e);
		}
	
	}
	
	//use stream
	public void addContact(String ad) {
		x.println("\n"+ad);
	}
	
	//close stream
	public void closeFile() {
		x.close();
	}



public static void main(String [ ]args) {
	//Scanner g = new Scanner(System.)
	Experiment fileadd = new Experiment();
	fileadd.openFile();
	fileadd.addContact(new Scanner(System.in).next());
	fileadd.closeFile();
}

}