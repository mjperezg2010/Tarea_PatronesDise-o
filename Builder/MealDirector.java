package Builder;


public class MealDirector {
    public void makeMeal(MealBuilder mealBuilder) {
		
		mealBuilder.addSandwich("Cubano");
		mealBuilder.addSides("Papas");
		mealBuilder.addDrink("Te");
		mealBuilder.addOffer("Postre Gratis");
		mealBuilder.setPrice(100);
	}
    
}
