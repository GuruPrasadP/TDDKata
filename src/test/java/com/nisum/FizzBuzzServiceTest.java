package com.nisum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzServiceTest {
	FizzBuzzService service = new FizzBuzzService();
	
	@Test
	public void shouldReturnFizzIfInputDividedBy3(){
		assertEquals("fizz", service.getResult(3));
		
	}
	@Test
	public void shouldReturnBuzzIfInpurtDividedBy5(){
		assertEquals("buzz", service.getResult(5));
	}
	
	@Test
	public void shouldReturnFizzBuzzInputDividedBy15(){
		assertEquals("fizzbuzz", service.getResult(15));
	}

	@Test
	public void shouldReturnSameNumber(){
		assertEquals("4", service.getResult(4));
	}
}
