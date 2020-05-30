package Builder;


public interface MealBuilder {
    public abstract void addSandwich(String sandwich);
    public abstract void addSides(String sides);
    public abstract void addDrink(String drink);
    public abstract void addOffer(String coupon);
    public abstract void setPrice(double price);
    public abstract Meal getMeal();
    
}
