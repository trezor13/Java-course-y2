
public class Cow extends Animal {
    private int numClaws;

    public Cow() {
    }

    public Cow(int numClaws) {
        this.numClaws = numClaws;
    }

    // getters & setters
    public int getNumClaws() {
        return numClaws;
    }

    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }
    @Override
    public void produceSound() {
        System.out.println("Momoing...");
    }
}