class StringBuilderTest
{
	public static void main(String[] args)
	{
		String str1 = "ABCDEFGHIJKLMN";
		StringBuilder sb1 = new StringBuilder(str1);
		System.out.println(sb1.reverse());

		// String str2 = "990208-1012752".replace("-", "");
		// System.out.println(str2);

		String str2 = "990208-1012752";
		StringBuilder sb2 = new StringBuilder(str2);
		int idx = sb2.indexOf("-");
		if(idx != -1)
		{
			System.out.println(idx);
			System.out.println(sb2.deleteCharAt(idx).toString());
		}		
	}
}