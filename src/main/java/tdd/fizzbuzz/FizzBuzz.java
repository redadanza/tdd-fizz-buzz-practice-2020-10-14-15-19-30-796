package tdd.fizzbuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final int MODULO_3 = 3;
    public static final int MODULO_5 = 5;
    public static final int MODULO_7 = 7;

    public String countOff(int orderNumber){
        String answer = "";
        if(isFizz(orderNumber, MODULO_3))
           answer += FIZZ;
        if(isBuzz(orderNumber, MODULO_5))
            answer += BUZZ;
        if(isWhizz(orderNumber, MODULO_7))
            answer += WHIZZ;
        if(answer == "")
            return String.valueOf(orderNumber);

        return answer;
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
