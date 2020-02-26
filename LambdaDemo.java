package com.capg;


import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;


public class LambdaDemo {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Double> power = (a, b) -> Math.pow(a, b);
		System.out.println(power.apply(10, 3));
		
		/*StringConversion sc = new StringConversion();
		String s = "raju";
		Function<String, String> result = sc::convertedString;
		System.out.println(result.apply(s));*/
		String s = "raju";
		Supplier<String> result = () -> s.replace("", " ").trim();
		System.out.println(result.get());
		
        BiPredicate<String,String> valid = (user,pass) -> (user.substring(0, pass.length()).equals(pass));
		System.out.println(valid.test("rahulravindran", "rahuli"));
	}
	
}