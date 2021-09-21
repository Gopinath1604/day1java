class RestrantSwitch
{
	public static void food(int item)
	{
		switch(item)
		{
			case 1:
			System.out.println("Chicken Lollypop");
			break;
			case 2:
			System.out.println("Biriyani");
			break;
			case 3:
			System.out.println("Special chicken Biriyani");

			break;
			case 4:
			System.out.println("Chicken fry");
			
			default:
			System.out.println("Food plays major role for life happiness");
		}

	}

	public static void main(String[] args) {
		food(2);
	}

}