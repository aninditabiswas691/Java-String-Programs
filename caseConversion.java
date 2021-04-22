import java.util.*;
class caseConversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		char ch=' ';
		String b=" ";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>=65 && ch<=90)
				b+=(char)(ch+32);
			else if(ch>=97 && ch<=122)
				b+=(char)(ch-32);
			else
				b+=(char)(ch);
				
		}
		System.out.println("String after conversion:"+b);

	}

}
