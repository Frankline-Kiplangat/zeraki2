// Function that transforms a string by reversing characters
class main { 
	public static String reverse(String strK)
	{
		return new StringBuilder(strK).reverse().toString();
	}

	public static void main(String[] args)
	{
		String strK = "Frankline Kiplangat";
		strK = reverse(strK);
		System.out.println(strK);
	}
}
// Output: tagnlpiK enilknarF
