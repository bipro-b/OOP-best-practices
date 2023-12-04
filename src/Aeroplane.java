public class Aeroplane implements Flyable,Sellable{
    @Override
    public void fly() {
        System.out.println("Fly in the sky.");
    }

    @Override
    public String getName() {
        return "Z-Plane";
    }

    @Override
    public int getPrice() {
        return 56000;
    }
}
