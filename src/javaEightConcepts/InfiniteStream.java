package javaEightConcepts;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// How to generate infinite Streams

		// 1). Iterate
		List<Integer> collect = IntStream.iterate(0, n -> n + 2).mapToObj(Integer::valueOf).limit(50)
				.collect(Collectors.toList());
		
		System.out.println(collect);
		// 2). Generate
		List<Integer> collect2 = Stream.generate(() -> (new Random().nextInt(100))).limit(100)
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
