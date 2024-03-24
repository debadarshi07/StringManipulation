package StringManipulation;
import java.util.Scanner;
public class AcronymGenerator {

	public static StringBuilder formAcronym(String data) {
		String words[]=data.split(" ");
		StringBuilder acronym=new StringBuilder();
		for(int i=0;i<words.length;i++) 
			acronym.append(words[i].toUpperCase().charAt(0));
		
		return acronym;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to form acronym:");
		String input=sc.nextLine();
		
		System.out.println("The acronym of the string given is: "+formAcronym(input));
		
		sc.close();
	}

}
