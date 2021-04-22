import java.util.*;
class arraytoString {

	public static void main(String[] args) {
		char chArray[]={'c','a','t',' ','d','o','g'};
		String str=" ";
		for(int i=0;i<chArray.length;i++)
		{
			str+=chArray[i];
		}

		System.out.println(str);
	}

}
