package StringManipulation;
import java.util.Scanner;
import java.util.ArrayList;
public class DuplicateCharacterRemover {
	
	public static String removeDuplicates(String data) {
		String dataInLowerCase=data.toLowerCase();
		
		char characters[]=dataInLowerCase.toCharArray();
		ArrayList<Character> finalChars=new ArrayList<>();
		
		for(int i=0;i<characters.length;i++) {
			if(!finalChars.contains(characters[i]) && characters[i]!=' ')
				finalChars.add(characters[i]);
			else if(characters[i]==' ')
				finalChars.add(characters[i]);
		}
		
		char updatedChars[]=new char[finalChars.size()];
		int index=0;
		while(!finalChars.isEmpty()) {
			updatedChars[index++]=finalChars.remove(0);
		}
		
		data = new String(updatedChars);
		return data;
	}
	
	public static String removeDuplicates2(String data) {
		String dataInLowerCase=data.toLowerCase();
		String updated="";
		char characters[]=dataInLowerCase.toCharArray();
		for(int i=0;i<characters.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(characters[i]==characters[j] && characters[i]!=' ') count++;
			}
			if(count==0) updated+=characters[i];
		}
		
		return updated;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string to remove duplicates:");
		String input=sc.nextLine();
		
		System.out.println("After removing all the duplicates: "+removeDuplicates(input));	
		System.out.println("After removing all the duplicates: "+removeDuplicates2(input));
		
		sc.close();
	}

}
