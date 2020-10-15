package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String countOff(int orderNumber){
        if(orderNumber % 3 == 0)
        {
            return  FIZZ;
        }
        if(orderNumber % 5 == 0)
        {
            return BUZZ;
        }

        return String.valueOf(orderNumber);
    }

}
