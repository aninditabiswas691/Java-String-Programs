import java.util.*;
class reverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a sentence:");
	     String str=sc.nextLine();
	     String inputArray[]=str.split(" ");
	     String reverseString=" ";
	     for(int i=0;i<inputArray.length;i++)
	     {
	    	 String word=" ",reverseWord=" ";
	    	 word=inputArray[i];
	    	 for(int j=word.length()-1;j>=0;j--)
	    	 {
	    		 reverseWord+=word.charAt(j);
	    	 }
	    	 reverseString+=reverseWord+" ";
	    	 
	     }
	     System.out.println(reverseString);

	}

}
