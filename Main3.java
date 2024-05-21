class Vehicle {
    public void startEngine() {
        System.out.println("Generic vehicle engine started.");
    }

    public void stopEngine() {
        System.out.println("Generic vehicle engine stopped.");
    }
}

class Car extends Vehicle {
    
    public void startEngine() {
        System.out.println("Car engine started.");
    }

   
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
   
    public void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

  
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
