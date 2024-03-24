package StringManipulation;
import java.util.Scanner;
public class VowelCounter {

	public static int countVowel(String data) {
		String dataInLowerCase=data.toLowerCase();
		int count=0;
		for(int i=0;i<data.length();i++)
			if(dataInLowerCase.charAt(i)=='a' || dataInLowerCase.charAt(i)=='e' || dataInLowerCase.charAt(i)=='i' || dataInLowerCase.charAt(i)=='o' || dataInLowerCase.charAt(i)=='u' )
				count++;
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a String to check:");
		String input=sc.nextLine();
		
		int count=countVowel(input);
		System.out.println(input +" has "+count+" vowels.");
		
		sc.close();
	}

}
