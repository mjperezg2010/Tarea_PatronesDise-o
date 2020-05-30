package Builder;


public class SandwichMealBuilder implements MealBuilder  {
    
    private Meal comida = new Meal();

    @Override
    public void addSandwich(String sandwich) {
            comida.sandwich = sandwich;
    }

    @Override
    public void addSides(String sides) {
            comida.sideOrder = sides;
    }

    @Override
    public void addDrink(String drink) {
            comida.drink = drink;
    }

    @Override
    public void addOffer(String coupon) {
            comida.offer = coupon;
    }

    @Override
    public void setPrice(double price) {
            comida.price = price;
    }

    @Override
    public Meal getMeal() {
            return comida;
    }

}
