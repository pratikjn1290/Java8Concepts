package javaEightConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sequential Stream
		Stream<String> stream = Stream.of("Pratik", "Jain", "QA", "Hello");
		stream.forEach(x -> System.out.println(x));

		// Stream has been already work done and stream is closed
		Stream<String> stream1 = Stream.of("Pratik", "Jain", "QA", "Hello");
		stream1.findAny().ifPresent(System.out::println);

		// Find list

		List<Integer> al = Arrays.asList(2, 3, 4, 5);
		al.stream().forEach(System.out::println);

		// Find first value

		al.stream().findFirst().ifPresent(System.out::println);

		// Print range

		IntStream.range(1, 5).forEach(System.out::println);

		Arrays.stream(new int [] {2,3,4,54,34}).map(n->2*n+1).average().ifPresent(System.out::println);

		Stream.of("A1","A2","A3","A4").map(s->s.substring(1)).mapToInt(Integer::parseInt);
		
		//Using Java 1.8 get even value
		
		Stream.iterate(0, n -> n+1).limit(20).filter(x -> x%2 ==0).forEach(System.out::println);
	}

}
