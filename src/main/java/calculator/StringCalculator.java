package calculator;

import java.util.Arrays;
import java.util.stream.Stream;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty())
        return 0;
    	
    	String delimiter=",|\n";
    	if(input.startsWith("//")) {
    		String[] parts = input.split("\n", 2);
    		delimiter = parts[0].substring(2);
    		input=parts[1];
    	}
    	
    		Stream<String> numbers=Arrays.stream(input.split(delimiter));
    		return numbers.mapToInt(Integer::parseInt).sum();
    		
    	}
    	
    }

