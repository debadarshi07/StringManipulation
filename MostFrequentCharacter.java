package StringManipulation;
import java.util.Scanner;
import java.util.LinkedHashMap;
public class MostFrequentCharacter {

	public static char mostFrequent(String data) {
		
		String dataToLowerCase=data.toLowerCase();
		LinkedHashMap<Character,Integer> hash=new LinkedHashMap<>();
		for(int i=0;i<data.length();i++) {
			if(dataToLowerCase.charAt(i)!=' ')
				hash.put(dataToLowerCase.charAt(i), 0);
		}
		
		for(int i=0;i<data.length();i++) {
			if(dataToLowerCase.charAt(i)!=' ')
				hash.put(dataToLowerCase.charAt(i), hash.get(dataToLowerCase.charAt(i))+1);
		}
		
		int maxFrequency=0;
		char maxKey=' ';
		for(char key:hash.keySet()) {
			if(hash.get(key)>maxFrequency) {
				maxFrequency=hash.get(key);
				maxKey=key;
			}	
		}
		return maxKey;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to check:");
		String input=sc.nextLine();
		
		System.out.println("Most frequent character in the given string is: "+ mostFrequent(input));
		
		sc.close();
	}

}
