import java.util.Scanner;
class concatString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=sc.nextLine();
		System.out.println("Enter second string:");
		String str2=sc.nextLine();
		System.out.println("Enter third string:");
		String str3=sc.nextLine();
		
		str1=(str1+" ").concat(str2);
		str1=(str1+" ").concat(str3);
		System.out.println("New string: "+str1);

	}

}
