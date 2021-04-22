import java.util.*;
class lengthCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int len=0;
		try
		{
			while(true)
			{
				str.charAt(len);
				len++;
			}
		}
		catch(Exception e){}
		System.out.println("Length is:"+len);

	}

}
