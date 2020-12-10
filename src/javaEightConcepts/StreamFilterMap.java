package javaEightConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customers> customerList = Arrays.asList(new Customers(20, "Pratik"), new Customers(22, "QA"),
				new Customers(21, "QA1"), new Customers(22, "qa2"));

	String name = customerList.stream().
	filter(x-> "QA".equals(x.getName())).
	map(Customers::getName).findAny().orElse(null);
	System.out.println(name);

	
	List <String> custList = customerList.stream().map(Customers :: getName)
	.collect(Collectors.toList());
	
	custList.forEach(System.out :: println);
	
	
	}
	


}
