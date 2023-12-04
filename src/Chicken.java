public class Chicken implements Flyable,Eatable {

    @Override
    public void fly() {
        System.out.println("Fly Rare.");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getNutrition() {
        return "Energy";
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
