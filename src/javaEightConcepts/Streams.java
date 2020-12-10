package javaEightConcepts;

import java.util.Arrays;
import java.util.List;

public class Streams {

	public static void main(String arg[]) {

		List<Customers> customerList = Arrays.asList(new Customers(20, "Pratik"), new Customers(22, "QA"),
				new Customers(21, "QA1"), new Customers(22, "qa2"));

		Customers customer = customerList.stream().filter(x -> "QA".equalsIgnoreCase(x.getName())).findAny()
				.orElse(null);

		System.out.println(customer.getName());

		Customers customer1 = customerList.stream().filter(x -> "QA1".equals(x)).findAny().orElse(null);
		System.out.println(customer1.getAge());

	}

}