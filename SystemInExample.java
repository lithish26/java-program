import java.io.IOException;
public class SystemInExample {
	public static void main(String [] args) throws IOException {
		System.out.println("Enter a character:");
		int data = System.in.read();
		System.out.println("You entered:"+(char)data);
		System.out.println("ASCII value:"+data);
	}
}



