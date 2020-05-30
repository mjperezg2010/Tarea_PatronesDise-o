
import Singleton.EagerSingleton;
import Factory.*;
import Observer.*;
import Builder.*;

public class Main {


    public static void main(String[] args) {
      
        System.out.println("------------Singleton------------\n");
        Singleton();
         System.out.println("------------Factory------------\n");
        Factory();
         System.out.println("------------Observer------------\n");
        Observer();
         System.out.println("------------Builder------------\n");
         Builder();
        
    }
    
    public static void Singleton(){
        EagerSingleton singleton= EagerSingleton.getInstance();
        EagerSingleton singleton1= EagerSingleton.getInstance();
        
    }
    
    public static void Factory(){
        
        CarFactory factory = new CarFactory();
        Car car = factory.buildCar(CarType.SMALL);
        System.out.println(car.getModel());
        Car car1 = factory.buildCar(CarType.SEDAN);
        System.out.println(car1.getModel());
        Car car2 = factory.buildCar(CarType.LUXURY);
        System.out.println(car2.getModel());
        
    }
    
    public static void Observer(){
        HeadHunter head = new HeadHunter();
        JobSeeker seeker = new JobSeeker("Pablo");
        JobSeeker seeker1 = new JobSeeker("Juan");
        head.registerObserver(seeker);
        head.registerObserver(seeker1);
        head.addJob("Cobrador");
        head.addJob("Secretario");
        head.notifyAllObservers();
        
    }
    
    public static void Builder(){
        MealBuilder mealBuilder = new SandwichMealBuilder();
        MealDirector mealDirector = new MealDirector();
        mealDirector.makeMeal(mealBuilder);
        Meal meal = mealBuilder.getMeal();
        System.out.println(meal.toString());
    }
    
}
