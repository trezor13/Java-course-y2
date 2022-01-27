public class FoodComposition {
    private String mainFood;
    private Animal owner;
    private String ingredient;
    private int kgs;

    public FoodComposition(){}

    public FoodComposition(String mainFood, String ingredient, int kgs, Animal owner){
        this.mainFood = mainFood;
        this.ingredient = ingredient;
        this.kgs = kgs;
        this.owner = owner;
    }

    public Animal getOwner() {
        return owner;
    }

    public String getMainFood() {
        return mainFood;
    }
}