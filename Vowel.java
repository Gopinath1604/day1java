class Vowel
{
	public static void check(char v)
	{
		if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
		{
			System.out.println("Vowel");
		}

		else
		{
			System.out.println("Not Vowel");
		}
	}

	public static void main(String[] args) {
		check('a');
		check('b');

	}
}