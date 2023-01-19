class ForTest4_1
{
	public static void main(String[] args) 
	{
   		int idx = 0;
   		int sum = 0;
   		int count = 0;

  		 for (int i = 0; sum <= 1000; i = i + 7) 
		{
     		 	idx = i;
      			sum += i;
      			count++;
   		}
 	 	System.out.printf(idx + " " + count + " " + sum);
	}
}

