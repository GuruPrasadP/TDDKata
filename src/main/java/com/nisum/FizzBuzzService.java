package com.nisum;

public class FizzBuzzService {

	public String getResult(int i) {
		if (i%15 ==0){
			return "fizzbuzz";
		}
		else if(i % 3 == 0) {
			return "fizz";
		}
		else if(i % 5 == 0) {
			return "buzz";
		} 
		return String.valueOf(i);
		
	}

}
