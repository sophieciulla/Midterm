import java.util.ArrayList;

public class RestaurantData
	{
		static ArrayList<Restaurant>rArray= new ArrayList <Restaurant>();
		
		public static void fillArray()
		{
			rArray.add(new Restaurant("The Spoon","Soup", 3.9));
			rArray.add(new Restaurant("Hot Soup", "Soup", 2.2));
			rArray.add(new Restaurant("Italy in America", "Pasta", 4.5));
			rArray.add(new Restaurant("Noodles Inc", "Pasta", 3.1));
			rArray.add(new Restaurant("Cheap Noodles", "Pasta", 2.4));
			rArray.add(new Restaurant("The Steaks are High", "Steak", 4.8));
			rArray.add(new Restaurant("Steak for Everyone", "Steak", 3.5));
			rArray.add(new Restaurant("We Make Steak", "Steak", 1.9));
			rArray.add(new Restaurant("Colorado Pizza", "Pizza", 4));
			rArray.add(new Restaurant("Pizza Locale", "Pizza", 3.1));
			rArray.add(new Restaurant("Fast Pizza", "Pizza", 2.2));
			rArray.add(new Restaurant("Mexico on Broadway", "Mexican", 2.1));
			rArray.add(new Restaurant("Everything Mexican", "Mexican", 3.8));
			rArray.add(new Restaurant("Sushi Sushi", "Sushi", 3.9));
			rArray.add(new Restaurant("So Sushi", "Sushi", 4.1));
			rArray.add(new Restaurant("Japan man", "Sushi", 4.5));
			rArray.add(new Restaurant("Everything but Sugar", "Dessert", 3.9));
			rArray.add(new Restaurant("Cookie Cutter", "7 Dessert", 3.2));
		}

	}
