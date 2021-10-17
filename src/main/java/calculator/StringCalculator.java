package calculator;

import java.util.Arrays;
import java.util.stream.Stream;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty())
        return 0;
    	else {
    		Stream<String> numbers=Arrays.stream(input.split(",|\n"));
    		return numbers.mapToInt(Integer::parseInt).sum();
    		
    	}
    	
    }

}