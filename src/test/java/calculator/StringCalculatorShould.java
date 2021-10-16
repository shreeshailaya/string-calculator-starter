package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_numbers_should_return_sum()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_unknown_amount_of_numbers()
    {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(10, stringCalculator.add("2,4,3,1"));
    }
}
