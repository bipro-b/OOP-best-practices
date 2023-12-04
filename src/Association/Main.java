package Association;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Shubham Rastogi");

        Mobile number1 = new Mobile();
        number1.setMobile_no("345435345");
        Mobile number2 = new Mobile();
        number2.setMobile_no("3453453");

        List<Mobile> numberList = new ArrayList<Mobile>();

        numberList.add(number1);
        numberList.add(number2);
        person.setNumbers(numberList);
        System.out.println(person.getName()+"has two numers: "+ person.getNumbers());


    }
}
