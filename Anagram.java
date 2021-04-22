import java.util.*;
class Anagram {

	static String remove_blanks(String str)
	{
		String str_mod=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				str_mod+=str.charAt(i);
		}
		return str_mod;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two strings:");
	     String str1=sc.nextLine();
	     String str2=sc.nextLine();
	     
	     str1=remove_blanks(str1);
	     str2=remove_blanks(str2);
	     
	
	     
	     char inputArray1[]=str1.toLowerCase().toCharArray();
	     char inputArray2[]=str2.toLowerCase().toCharArray();
	     Arrays.sort(inputArray1);
	     Arrays.sort(inputArray2);
	     boolean status;
	     status=Arrays.equals(inputArray1,inputArray2);
	     if(status)
	    	 System.out.println("Strings are Anagrams!");
	     else
	    	 System.out.println("Strings are not Anagrams!");

	}

}
