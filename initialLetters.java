import java.util.*;
class initialLetters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String str=sc.nextLine();
		 str=" "+str;
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
				 System.out.print(str.toUpperCase().charAt(i+1)+" ");
		 }

	}

}
