package javaEightConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIFindAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> product = new ArrayList<String>();

		product.add("shoes");
		product.add("macbook");
		product.add("tshirt");
		product.add("watch");
		product.add("shocks");

		product.stream().forEach(x -> System.out.println(x));

		List<String> data = product.stream().filter(x -> !x.equals("shoes")).collect(Collectors.toList());
		data.stream().forEach(elem -> System.out.println(elem));
	}

}
