package StringManipulation;
import java.util.Scanner;
public class CaesarCipherEncryptionDecryption {

	public static String encryptCaesarCipher(String data,int shift) {
		char characters[]=data.toCharArray();
		for(int i=0;i<characters.length;i++) {
			if(Character.isUpperCase(characters[i]) && characters[i]!=' ')
				characters[i]=(char)(((int)characters[i]-65+shift)%26+65);
			else if(Character.isLowerCase(characters[i]) && characters[i]!=' ')
				characters[i]=(char)(((int)characters[i]-97+shift)%26+97);
		}
		
		return String.copyValueOf(characters);
	}
	
	public static String decryptCaesarCipher(String data,int shift) {
		char characters[]=data.toCharArray();
		for(int i=0;i<characters.length;i++) {
			if(Character.isUpperCase(characters[i]) && characters[i]!=' ') {
				int temp=((int)characters[i]-65-shift)%26;
				if(temp<0) characters[i]=(char)(90+temp+1);
				else characters[i]=(char)((int)characters[i]-shift);
			}else if(Character.isLowerCase(characters[i]) && characters[i]!=' ') {
				int temp=((int)characters[i]-97-shift)%26;
				if(temp<0) characters[i]=(char)(122+temp+1);
				else characters[i]=(char)((int)characters[i]-shift);
			}	
		}
		
		return String.copyValueOf(characters);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter string to encrypt: ");
		String input=sc.nextLine();
		
		System.out.print("Enter shift digit: ");
		int shift=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Encrypted string is: "+encryptCaesarCipher(input,shift));
		
		System.out.print("Enter an encrypted string to decrypt: ");
		String input2=sc.nextLine();
		
		System.out.print("Enter shift digit: ");
		int shift2=sc.nextInt();
		
		System.out.println("Decrypted string is: "+decryptCaesarCipher(input2,shift2));
		
		sc.close();
	}

}
