import java.io.IOException;

public class OopDemo {

    public  FoodComposition processFood(Animal animal){
        if (animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.setName("SIMBA");
            return new FoodComposition("meat", "tada", 2,dog);
        }else if (animal instanceof Cow){
            Cow cow = (Cow) animal;
            cow.setName("iBIHOGO");
            return new FoodComposition("URUBINGO", "salt", 500, cow);
        }

        return new FoodComposition("glass", "salt", 50, animal);
    }

    public static void main(String [] args ) throws IOException{
        Animal animal = new Animal();
        animal.produceSound();
        animal.produceSound(AnimalType.OTHERS);

        Animal dog = new Dog(5);
        animal.produceSound();
        animal.produceSound(AnimalType.CARNIVORE);

        OopDemo demo = new OopDemo();
        FoodComposition components = demo.processFood(dog);
        System.out.println("Name " + components.getOwner().getName() + " most food"+ components.getMainFood());



        Animal cow = new Cow();
        FoodComposition cowfoodcomps = demo.processFood(cow);
        System.out.println("Name " + cowfoodcomps.getOwner().getName() + " most food "+ cowfoodcomps.getMainFood());

        Dog dogg = new Dog();
        FoodComposition doggcomps = demo.processFood(dogg);
        System.out.println("Name " + doggcomps.getOwner().getName() + " most food"+ doggcomps.getMainFood());

        Cow coww= new Cow();
        FoodComposition cowwfoodcomps = demo.processFood(coww);
        System.out.println("Name " + cowwfoodcomps.getOwner().getName() + " most food "+ cowwfoodcomps.getMainFood());

    }
}