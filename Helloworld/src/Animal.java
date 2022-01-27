
public class Animal {
    private int legs;
    private String name;
    private AnimalType type;

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(){}

public void produceSound(){
    System.out.println("Gneric sound");
        };

public void produceSound(AnimalType type){
    System.out.println("Sound of"+ type.name());
}
}