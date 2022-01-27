public class Dog extends Animal{
    private int numclaws;
    public int getNumclaws() {
        return numclaws;
    }
    public void setNumclaws(int numclaws) {
        this.numclaws = numclaws;
    }
    public Dog(){}
    public Dog(int numclaws){
        this.numclaws= numclaws;
    }

    @Override
    public void produceSound() {
        System.out.println("Barking");
    }
}
