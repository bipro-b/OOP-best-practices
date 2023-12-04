import java.util.Random;

public class Polymorphism {
    public static void main(String[] args) {

        for(int i=0;i<20;i++){
            TVSerial serial = getTVSerial();

            System.out.println(serial.getPlot());
        }

    }

   public static TVSerial getTVSerial(){
        int randomNUmber = new Random().nextInt();
        randomNUmber = randomNUmber%5;
       System.out.println(randomNUmber);
         switch (randomNUmber){
             case 0:
                 return new BreakingBad();
             case 1:
                 return new WalkingDead();
             case 2:
                 return new Dark();
             case 3:
                 return new Dexter();
             case 4:
                 return new GameThrones();
       }
      return  new Dexter();
   }
}
