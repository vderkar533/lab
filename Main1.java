
class Animal {
  
    public void move() {
        System.out.println("Animal is moving.");
    }
    
 
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}


class Bird extends Animal {
 
 
    public void move() {
        System.out.println("Bird is flying.");
    }
    
   
    public void makeSound() {
        System.out.println("Bird is chirping.");
    }
}


class Panthera extends Animal {
   
    public void move() {
        System.out.println("Panthera is walking.");
    }
    
   
    public void makeSound() {
        System.out.println("Panthera is roaring.");
    }
}


public class Main1 {
    public static void main(String[] args) {
       
        Animal animal = new Animal();
        animal.move(); 
        animal.makeSound(); 
        
        Bird bird = new Bird();
        bird.move(); 
        bird.makeSound(); 
        
        Panthera panthera = new Panthera();
        panthera.move(); 
        panthera.makeSound();
    }
}
