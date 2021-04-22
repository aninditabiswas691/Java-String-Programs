
class BulbChain {
	public static String arrToString(char arr[])
	{
		String str=" ";
		for(int i=0;i<arr.length;i++)
		{
			str=str+arr[i];
		}
		return str;
	}
	public static boolean isUnique(char c, String str)
	{
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			if(c==str.charAt(i))
			{
				flag=true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String stringA="abcde";
		String stringB="abcvdeoj";
		int trans=0;
		if(stringA.equals(stringB))
		{
			System.out.println("Number of modifications: "+trans);
		}
		
		
		else
		{
			
			if(stringA.length()==stringB.length()){
				char stringA_arr[]=stringA.toCharArray();
			char stringB_arr[]=stringB.toCharArray();
			for(int i=0;i<stringA_arr.length;i++)
			{
				if(stringA_arr[i]!=stringB_arr[i])
				{
					stringA_arr[i]=stringB_arr[i];
					trans++;
				}
			}
		
		stringA=arrToString(stringA_arr);
		stringB=arrToString(stringB_arr);
		System.out.println("Number of modifications: "+trans);
		System.out.println("stringA: "+stringA+ " stringB: "+stringB);
			}
	}
		 if(stringA.length()>stringB.length())
		{
			boolean flag;
			
			
			for(int i=0;i<stringA.length();i++)
			{
				char ch=stringA.charAt(i);
				flag=isUnique(ch,stringB);
				if(flag==false)
				{
					System.out.println(ch);
					stringA=stringA.replace(ch, ' ');
					trans++;
				}

					
				}
			System.out.println("Number of modifications: "+trans);
			System.out.println("stringA: "+stringA+ " stringB: "+stringB);
			}
			
		 if(stringA.length()<stringB.length())
			{
				boolean flag;
				StringBuffer sb=new StringBuffer(stringA);
				for(int i=0;i<stringB.length();i++)
				{
					char ch=stringB.charAt(i);
					flag=isUnique(ch,stringA);
					if(flag==false)
					{
					int index=stringB.indexOf(ch);
					sb=sb.insert(index, ch);
					trans++;
					}
}
				
				System.out.println("Number of modifications: "+trans);
				System.out.println("stringA: "+sb+ " stringB: "+stringB);
				}

		}
		
	}

