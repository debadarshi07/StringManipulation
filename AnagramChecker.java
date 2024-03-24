package StringManipulation;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramChecker {

	public static boolean areAnagrams(String data1,String data2) {

		if(data1.length() != data2.length()) return false;
		
		String dataToLowerCase1=data1.toLowerCase(),dataToLowerCase2=data2.toLowerCase();
		char characters1[]=dataToLowerCase1.toCharArray();
		char characters2[]=dataToLowerCase2.toCharArray();
		boolean isAnagram1=false,isAnagram2=false;
		
		int count1=0;
		for(int i=0;i<characters1.length;i++) {
			int j=0;
			for(j=0;j<characters2.length;j++) {
				if(characters1[i]==characters2[j]) break;
			}
			if(j<characters2.length) count1++;
		}
		if(count1==characters1.length) isAnagram1=true;
		
		int count2=0;
		for(int i=0;i<characters2.length;i++) {
			int j=0;
			for(j=0;j<characters1.length;j++) {
				if(characters2[i]==characters1[j]) break;
			}
			if(j<characters1.length) count2++;
		}
		if(count2==characters1.length) isAnagram2=true;
		
		return isAnagram1 && isAnagram2;
	}
	
	public static boolean areAnagrams2(String data1,String data2) {
		
		if(data1.length()!=data2.length()) return false;
		
		String dataToLowerCase1=data1.toLowerCase(),dataToLowerCase2=data2.toLowerCase();
		char characters1[]=dataToLowerCase1.toCharArray();
		char characters2[]=dataToLowerCase2.toCharArray();
		
		
		Arrays.sort(characters1);
		Arrays.sort(characters2);
		
		for(int i=0;i<characters1.length;i++) {
			if(characters1[i]!=characters2[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first string:");
		String input1=sc.next();
		
		System.out.print("Enter second string:");
		String input2=sc.next();
		
		if(areAnagrams(input1,input2))
			System.out.println("Given strings are anagrams.");
		else
			System.out.println("Given strings are not anagrams.");
		
		if(areAnagrams2(input1,input2))
			System.out.println("Given strings are anagrams.");
		else
			System.out.println("Given strings are not anagrams.");
		
		sc.close();
	}

}
