package StringManipulation;
import java.util.Scanner;
public class PigLatinTranslator {

	public static String translatePigLatin(String data) {
		String dataInLowerCase=data.toLowerCase();
		
		int index=-1;
		for(int i=0;i<dataInLowerCase.length();i++) {
			if(dataInLowerCase.charAt(i)=='a' || dataInLowerCase.charAt(i)=='e' || dataInLowerCase.charAt(i)=='i' || dataInLowerCase.charAt(i)=='o' || dataInLowerCase.charAt(i)=='u' ) {
				
				index=i; break;
			}
		}
		if(index==-1) {
			return "A string with no vowels can't be translated into Pig Latin format.";
		}
		
		return dataInLowerCase.substring(index)+dataInLowerCase.substring(0,index)+"ay";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a word to translate:");
		String input=sc.next();
		
		System.out.println("The Pig Latin format of "+input+" is "+translatePigLatin(input)+".");
		
		sc.close();
	}

}
