package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
       
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        
        assertEquals(1, StringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_number_should_return_number_as_sum() {
       
        assertEquals(3, StringCalculator.add("1,2"));
    }
    
    @Test
    void string_with_unkmown_amount_of_number_should_return_number_as_sum() {
       
        assertEquals(113, StringCalculator.add("1,2,50,60"));
    }
    
    @Test
    void string_with_newline_between_number_should_return_number_as_sum() {
       
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
    
    @Test
    void delimiter_specified_between_number_should_return_number_as_sum() {
        
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
}
