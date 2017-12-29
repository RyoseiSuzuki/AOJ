import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
        // input keyboard
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	StringBuilder line = new StringBuilder(br.readLine());
        // space split
  	String[] input = line.toString().split(" ");
        // calc area
  	int a = Integer.parseInt(input[0]);
        // perimeter of the rectangle in a line
  	int b = Integer.parseInt(input[1]);
  	int result1 = a * b;
  	int result2 = a + a + b + b; 
  	System.out.println(result1 + " " + result2);
 }		
}
