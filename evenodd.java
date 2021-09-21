class evenodd
{
	public static void check(int n)
	{
		if(n%2==0)
		{
			System.out.println("number is even");

		}
		else
		{
			System.out.println("number is odd");
		}

	}

	public static void main(String[] args) {
		check(10);
		check(9);
	}
}