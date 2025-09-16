package com.dinesh.streamChanges;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		System.out.println("------------------------------------");
		// Stream.ofNullable construct stream from single element
		Stream.ofNullable("String").forEach(System.out::println);

		System.out.println(Stream.ofNullable(null).count());

		// dropWhile-- returns d, a stream consisting of the remaining elements of this
		// stream after dropping the longest prefix of elements that match the given
		// predicate. Otherwise returns, if this stream is unordered, a stream
		// consisting of the remaining elements of this stream after dropping a subset
		// of elements that match the given predicate.
	
		List<Integer> list = Stream.of(1,2,4,5,6,7,8,99)
								.dropWhile(n -> n < 4)
								.collect(Collectors.toList());
		System.out.println(list);//[4, 5, 6, 7, 8, 99]
		
		 list = Stream.of(2, 4, 5, 66, 4, 1, 22)
						.dropWhile(n -> n < 4)
						.collect(Collectors.toList());
		System.out.println(list);//[4, 5, 66, 4, 1, 22]
		System.out.println("------------------------------------");
		
		//takewhile-- if this stream is ordered, returns longest prefix of 
		//elements taken from this stream that match the given predicate. Otherwise returns, 
		//if this stream is unordered, a stream consisting of a subset of elements taken from 
		//this stream that match the given predicate.
		
		list = Stream.of(1,2,4,5,6,7,8,99)
				.takeWhile(n -> n < 4)
				.collect(Collectors.toList());
			System.out.println(list);//[1, 2]

		list = Stream.of(2, 4, 5, 66, 4, 1, 22)
					.takeWhile(n -> n < 4)
					.collect(Collectors.toList());
		System.out.println(list);//[2]

		System.out.println("------------------------------------");
		
	}
}
