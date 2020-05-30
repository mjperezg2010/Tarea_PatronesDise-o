package Builder;


public class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;

    public Meal() {
    }
    
    

    @Override
    public String toString() {
        return "La comida seria un sandwich "+sandwich + ", sideOrder seria: " + sideOrder + ", drink: " + drink + ", offer: " + offer + ", price: " + price;
        
    }

    
}
