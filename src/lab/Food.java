package lab;

public abstract class Food implements INutritious, IConsumable{
    int calories = 0;
    int amountOfParams = 0;
    private String name;

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }

}
