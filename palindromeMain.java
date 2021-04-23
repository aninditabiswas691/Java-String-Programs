import java.util.*;
class palindromeMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		char ch;
		String str2="";
		for(int i=(str.length()-1);i>=0;i--)
		{
			
			str2=str2+(str.charAt(i));
			
		}
		if(str.equals(str2))
			System.out.println("The string "+str+" is a palindrome!");
		else
			System.out.println("The string "+str+" is not a palindrome!");

	}

}
