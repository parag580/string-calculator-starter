package calculator;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class StringCalculator {

private String delimiter;
private String numbers;

	 private StringCalculator(String delimiter, String numbers) {
	
	this.delimiter = delimiter;
	this.numbers = numbers;
}
private int add() {
	ensureNoNegativeNumbers();
	return getNumbers().sum();
	}

private void ensureNoNegativeNumbers() {
	String negativeNumberSequence = getNumbers().filter(n -> n < 0)
			.mapToObj(Integer::toString)
			.collect(Collectors.joining(","));
	if (!negativeNumberSequence.isEmpty()) {
		throw new IllegalArgumentException("negative number: " + negativeNumberSequence);
	}
}


private IntStream getNumbers() {
	if(numbers.isEmpty()) {
        return IntStream.empty();
}else{
	return Arrays.stream(numbers.split(delimiter))
			.mapToInt(Integer::parseInt)
			.map(n -> n%1000);
}
}
	public static int add(String input) {
	    	
	    	return parseInput(input).add();
	}
	
	
	private static StringCalculator parseInput(String input) {
	    	
	    	if(input.startsWith("//")) {
	    		String[] parts = input.split("\n", 2);
	    		return new StringCalculator( parts[0].substring(2),parts[1]);
	    	}else {
	    		return new StringCalculator(",|\n",input);
	    	}  	
	    		
	    	}
	
	}
    		
    		
    	
    	
    

