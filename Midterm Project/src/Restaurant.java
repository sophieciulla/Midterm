
public class Restaurant
	{
		private String name;
		private String food;
		private double rating;
		
		public Restaurant(String n, String f, double r)
		{
			name = n;
			food = f;
			rating = r;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getFood()
			{
				return food;
			}

		public void setFood(String food)
			{
				this.food = food;
			}

		public double getRating()
			{
				return rating;
			}

		public void setRating(double rating)
			{
				this.rating = rating;
			}

		
		
	}
