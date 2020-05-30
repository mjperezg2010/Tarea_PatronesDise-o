
package Factory;

public class Car {
    CarType model;
    
    
    public Car(){}

    public Car(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
    
}
