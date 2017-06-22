package com.nisum;

public class FizzBuzzService {

	public String getResult(int i) {
		String result = null;
		if (i%15 ==0){
			result = "fizzbuzz";
		}
		else if(i % 3 == 0) {
			result = "fizz";
		}
		else if(i % 5 == 0) {
			result = "buzz";
		} else{
			result=String.valueOf(i);
		}
		return result;
	}

}
