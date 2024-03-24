package StringManipulation;
import java.util.Scanner;
public class WordReversal {

	public static StringBuilder reverseString(String data) {
		String words[]=data.split(" ");
		StringBuilder reversedString=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			reversedString.append(words[i]+" ");
		}
		
		return reversedString;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to reverse:");
		String input=sc.nextLine();
		
		System.out.println("Reversed string is: "+ reverseString(input));
		
		sc.close();
	}

}
