public class Eagle implements Flyable,Lively{

    @Override
    public void fly() {
        System.out.println("Flapping feather..");
    }

    @Override
    public String getName() {
        return "White eagle";
    }

    @Override
    public int getLivingYear() {
        return 100;
    }
}
