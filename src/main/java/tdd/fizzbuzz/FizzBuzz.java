package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int MODULO_3 = 3;
    public static final int MODULO_5 = 5;
    public static final int MODULO_7 = 7;

    public String countOff(int orderNumber){
        if(isFizz(orderNumber, MODULO_3) && isBuzz(orderNumber, MODULO_5))
        {
            return "FizzBuzz";
        }
        if(isFizz(orderNumber, MODULO_3))
        {
            return  FIZZ;
        }
        if(isBuzz(orderNumber, MODULO_5))
        {
            return BUZZ;
        }
        if(isWhizz(orderNumber, MODULO_7)){
            return WHIZZ;
        }

        return String.valueOf(orderNumber);
    }

    private boolean isWhizz(int orderNumber, int modulo7) {
        return orderNumber % modulo7 == 0;
    }

    private boolean isBuzz(int orderNumber, int modulo5) {
        return isWhizz(orderNumber, modulo5);
    }

    private boolean isFizz(int orderNumber, int modulo3) {
        return isBuzz(orderNumber, modulo3);
    }

}
