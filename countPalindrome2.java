
import java.util.*;
class countPalindrome2 {
	static boolean checkPalindrome(String str1)
	{
		
		for(int i=0;i<str1.length();i++)
		{
			if((str1.charAt(i))!=(str1.charAt(str1.length()-i-1)))
				return false;
			
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str=sc.nextLine();
		
		String word=" ",ans=" ";
		int count=0;
		
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreTokens())
		{
			word=st.nextToken();
			if(checkPalindrome(word))
			{
				count++;
				ans=ans+" "+word;
			}
				
	}
		if((ans.length()-1)==0)
		{
			System.out.println("No palindrome found!");
		}
		else
		{
			System.out.println(ans);
			System.out.println(count);
		}
		
}
}