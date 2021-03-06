package numberreverse;

public class NumberReverse
{
	public static void main(String[] args)
	{
		System.out.println(reverseNumber(123456789));
	}
	
	static int reverseNumber(int number)
	{
		if(number<0)
		{
			throw new IllegalArgumentException("Must be positive.");
		}
		
		int reverse=0;
		int remainder=0;
		
		do
		{
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}while(number>0);
		
		return reverse;
	}
}