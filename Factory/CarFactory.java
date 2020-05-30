
package Factory;


public class CarFactory {
    
     public CarFactory() {
    }
    
    
    
    public Car buildCar(CarType model){
        
        switch (model) {
            case LUXURY:
                return new LuxuryCar();
            case SEDAN:
                return new SedanCar();
            default:
                return new SmallCar();
        }
        
       
    }
}
