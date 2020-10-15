package tdd.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_oder_number_1(){
        //given
        int orderNum = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNum);

        //then
        assertEquals("1", actual);
    }
    @Test
    public void should_return_Fizz_when_count_off_given_order_number_3(){
        //given
        int orderNum = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNum);

        //then
        assertEquals("Fizz", actual);
    }
    @Test
    public void should_return_Buzz_when_count_off_given_order_number_5(){
        //given
        int orderNum = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNum);

        //then
        assertEquals("Buzz", actual);
    }
    @Test
    public void should_return_Whizz_when_count_off_given_order_number_7(){
        //given
        int orderNum = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNum);

        //then
        assertEquals("Whizz", actual);
    }
    @Test
    public void should_return_FizzBuzz_when_count_off_given_order_number_15(){
        //given
        int orderNum = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNum);

        //then
        assertEquals("FizzBuzz", actual);
    }

}
