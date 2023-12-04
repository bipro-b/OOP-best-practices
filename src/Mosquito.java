public class Mosquito implements Flyable,Lively{
    @Override
    public void fly() {
        System.out.println("Looking for blood.");
    }

    @Override
    public String getName() {
        return "Adis";
    }

    @Override
    public int getLivingYear() {
        return 5;
    }
}
