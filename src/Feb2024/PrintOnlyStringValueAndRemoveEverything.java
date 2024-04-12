package Feb2024;

public class PrintOnlyStringValueAndRemoveEverything {
	
	
	public static void main(String[] args) {
		removeNonAlphabeticCharsWithInbuiltFunctions();
	}
	
	public static void removeNonAlphabeticCharsWithInbuiltFunctions()
	{
		try {
			
			String str="Hello123World456)@(#(@(#)@";
			
			String str1=str.replaceAll("[^a-zA-Z]", "");
			System.out.println(str1);
		} catch (Exception e) {
				throw e;
		}
	}
	
	public static void removeNonAlphabeticCharsUsingRoop()
	{
		try {
			
			String str="Hello123World456)@(#(@(#)@";
			
			char[] char2=str.toCharArray();
			
			for(int i=0;i<char2.length;i++)
			{
				if((char2[i] >'A' && char2[i]<'Z') || (char2[i] >'a' && char2[i]<'z'))
				{
					System.out.print(char2[i]);
				}
			}
			
		} catch (Exception e) {
				throw e;
		}
	}

}
