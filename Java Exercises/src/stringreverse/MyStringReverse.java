package stringreverse;

public class MyStringReverse
{
	public static void main(String[] args)
	{
		System.out.println(reverseString("abcd"));
	}
	
	static String reverseString(String input)
	{
		StringBuilder output=new StringBuilder();
		for(int i=input.length()-1; i>=0; i--)
		{
			output.append(input.charAt(i));
		}
		return output.toString();
	}
}