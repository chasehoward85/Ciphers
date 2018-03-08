import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		
		Scanner kbReader = new Scanner(System.in);
		
		System.out.println("Please type sentence");
		String s = kbReader.nextLine();
		
		System.out.println("Please type shift value");
		int t = kbReader.nextInt();
		
		Ciphers test = new Ciphers(s, t);
		
		//test.CaesarCipher();
		//test.LeftShift();
		//test.TwoLetters();

	}

}
