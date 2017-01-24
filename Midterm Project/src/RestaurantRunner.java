import java.util.Scanner;


public class RestaurantRunner
	{

		public static void main(String[] args)
			{
				RestaurantData.fillArray();
				
				
				System.out.println("What type of food are you in the mood for? Some options are...");
				System.out.println("1. Soup    2. Pasta    3. Steak    4. Pizza    5. Mexican    6. Sushi    7. Dessert");
			

				Scanner userInput = new Scanner(System.in);
				int userChoice = userInput.nextInt();
				String foodType = " ";
				
				if (userChoice == 1)
					{
						foodType = "Soup";
					}
				if (userChoice == 2)
					{
						foodType = "Pasta";
					}
				if (userChoice == 3)
					{
						foodType = "Steak";
					}
				if (userChoice == 4)
					{
						foodType = "Pizza";
					}
				if (userChoice == 5)
					{
						foodType = "Mexican";
					}
				if (userChoice == 6)
					{
						foodType = "Sushi";
					}
				if (userChoice == 7)
					{
						foodType = "Dessert";
					}
				for (Restaurant r: RestaurantData.rArray)
					{		
					if (r.getFood().equals(foodType))
						{
							System.out.println(r.getName() + " with a rating of " + r.getRating());
						}
					}
			}
			
	}
