import java.util.*;
class countPalindrome {
static boolean isPalindrome(String str)
{
	char ch=' ';
	for(int i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if(ch!=str.charAt(str.length()-i-1))
		{
			return false;
		}
			
	}
	return true;
}
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a sentence:");
     String str=sc.nextLine();
     String inputArray[]=str.split(" ");
     int ctr=0;String ans=" ";
     for(int i=0;i<inputArray.length;i++)
     {
    	 String b=" ";
         b=inputArray[i];
         if(isPalindrome(b))
         {
        	 ctr++;
        	 ans+=b+" ";
         }
     
	}
     System.out.println(ans);

}
}

