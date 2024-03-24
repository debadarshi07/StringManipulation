package StringManipulation;
import java.util.Scanner;
public class PalindromeChecker {
	public static boolean isPalindrome(String data) {
		String dataInLowerCase=data.toLowerCase();
		char characters[]=dataInLowerCase.toCharArray();
		int i=0,j=characters.length-1;
		while(i<j) {
			if(characters[i]==characters[j]) {
				i++; j--;
			}else break;
		}
		return i>=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to check:");
		String input=sc.next();
		
		if(isPalindrome(input)) 
			System.out.println(input +" is a palindrome string.");
		else 
			System.out.println(input +" is not a palindrome string.");
			
		sc.close();
	}

}
