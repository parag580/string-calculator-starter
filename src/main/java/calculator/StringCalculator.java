package calculator;

import java.util.Arrays;
import java.util.stream.IntStream;


public class StringCalculator {

private String delimiter;
private String numbers;

	 private StringCalculator(String delimiter, String numbers) {
	
	this.delimiter = delimiter;
	this.numbers = numbers;
}
private int add() {
	if(getNumber().anyMatch(n -> n <0)) {
		throw new IllegalArgumentException();
	}
	return  getNumber().sum();
}

private IntStream getNumber() {
	return Arrays.stream(numbers.split(delimiter))
			.mapToInt(Integer::parseInt);
}
	public static int add(String input) {
	    	if(input.isEmpty())
	        return 0;
	    	
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
    		
    		
    	
    	
    

