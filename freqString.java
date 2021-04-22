
import java.util.*;
class freqString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str=sc.nextLine();
		
		String inputArray[]=str.split(" ");
		for(int i=0;i<inputArray.length;i++)
		{
			int count=0;
			for(int j=i+1;j<inputArray.length;j++)
			{
				if(inputArray[i].equalsIgnoreCase(inputArray[j]))
				{
					count++;
					System.out.println(inputArray[i]+" occurs "+(count+1)+" times.");
				}
				
			}
		}
	}
}