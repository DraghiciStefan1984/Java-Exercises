package stringreverse;

public class StringReverse
{
	public static void main(String[] args)
	{
		//System.out.println(reverseStringBuilder("asdfghjk"));
		//System.out.println(reverseStringCharArray("asdfghjk"));
		//System.out.println(reverseStringEffective("asdfghjk"));
		//System.out.println(reverseStringRecursionOne("asdfghjk"));
		System.out.println(reverseStringRecursionTwo("asdfghjk"));
	}
	
	static String reverseStringBuilder(String source)
	{
		int i, len=source.length();
		StringBuilder destination=new StringBuilder();
		
		for(i=(len-1); i>=0; i--)
		{
			destination.append(source.charAt(i));
		}
		return destination.toString();
	}
	
	static String reverseStringCharArray(String input)
	{
		int begin=0;
		int len=input.length();
				
		char[] in=input.toCharArray();
		char[] out=new char[len];

		for(int end=len-1; end>=0; end--)
		{
			out[begin]=in[end];
			begin++;
		}
		
		return new String(out);
	}
	
	static String reverseStringEffective(String input)
	{
		char[] in=input.toCharArray();
		int begin=0;
		int end=in.length-1;
		char temp;
		
		while(end>begin)
		{
			temp=in[begin];
			in[begin]=in[end];
			in[end]=temp;
			end--;
			begin++;
		}
		
		return new String(in);
	}
	
	static String reverseStringRecursionOne(String input)
	{
		return reverse(input, input.length()-1);
	}
	
	static String reverse(String input, int index)
	{
		if(index==0)
		{
			return input.charAt(0)+"";
		}
		char letter=input.charAt(index);
		return letter+reverse(input, index-1);
	}
	
	static String reverseStringRecursionTwo(String input)
	{
		if(input.length()==0)
		{
			return input;
		}
		return reverseStringRecursionTwo(input.substring(1))+input.charAt(0);
	}
}
