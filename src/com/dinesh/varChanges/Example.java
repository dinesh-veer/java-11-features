package com.dinesh.varChanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import javax.annotation.Nonnull;



public class Example {

	public static void main(String[] args) {

		// Before java 10 we have to use
		String text1 = "Hello Java 11";

		// From java 10 replace String with var. The compiler infers the correct type
		// from the assignment of the variable. In this case text is of type String
		var text = "Hello Java 11";

		// Variables declared with var are still statically typed. You cannot reassign
		// incompatible types to such variables. This code snippet does not compile:
		// text = 2322; // Incompatible types Type mismatch: cannot convert from int to
		// String

		// we can use final modifier to var keyword
		final var key = "sample key";
		// key="text to be changed";//The final local variable key cannot be assigned.

		// Cannot infer type:
		/*
		 * var a ; var nothing = null; var lambda = () -> System.out.println("Pity!");
		 * var method = this::someMethod;
		 */

		// Local variable type inference really shines with generic involved. 
		//verbose type of Map<String, List<Integer>>
		// which can be reduced to a single var keyword, saving you from typing a lot of
		// boilerplate:
		
		var myList = new ArrayList<Map<String, List<Integer>>>();
		myList.add(Map.of(key, List.of(2, 3)));
		for (var current : myList) {
			// current is inferred to type: Map<String, List<Integer>>
			System.out.println(current);
		}
		
		//java 11 can use var keyword in lambda expressions
		Predicate<String> predicate = (@Nonnull var a) -> true;
		System.out.println(predicate);
		
	}

}
