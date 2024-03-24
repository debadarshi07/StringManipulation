package StringManipulation;
import java.util.Scanner;
public class StringRotationChecker {
	public static int areRotations(String data1,String data2) {
		String dataInLowerCase1=data1.toLowerCase(),dataInLowerCase2=data2.toLowerCase();
		
		if(data1.length()!=data2.length()) return -1;
		
		String concat=dataInLowerCase1.concat(dataInLowerCase1);
		return concat.indexOf(dataInLowerCase2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first string: ");
		String input1=sc.nextLine();
		
		System.out.print("Enter second string: ");
		String input2=sc.nextLine();
		
		if(areRotations(input1,input2)==-1)
			System.out.println("Given strings are not rotations of each other.");
		else
			System.out.println("Given strings are rotations of each other.");
		
		sc.close();
	}

}
