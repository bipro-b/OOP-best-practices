public class Interface {
    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        Aeroplane aeroplane = new Aeroplane();
        Rice rice = new Rice();
        Chicken chicken = new Chicken();
        sell(aeroplane);
        eat(chicken);
        eat(rice);
        fly(eagle);
    }
    public static void sell(Sellable sellable){
        System.out.println(sellable.getPrice());
    }
    public  static void eat(Eatable eatable){
        System.out.println(eatable.getNutrition());
        System.out.println(eatable.getPrice());
    }
    public static  void fly(Flyable flyable){
        flyable.fly();
        System.out.println(flyable.getName());
    }
}
