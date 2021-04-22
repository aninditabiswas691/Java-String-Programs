import java.util.Scanner;
class copyString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		char ch;
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			
			str2=str2+(str.charAt(i));
			
		}
		
			System.out.println("New String: "+str2);
		

	}

}
