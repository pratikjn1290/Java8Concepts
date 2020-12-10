package javaEightConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class lamdaExpressionAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List and For Each

		ArrayList<String> names = new ArrayList<String>();
		names.add("Name");
		names.add("Govind");
		names.add("Hari");
		names.add("Hari");

		// Anonymous class

		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});

		System.out.println("------------Using Lambda------------");
		// lamda
		names.stream().forEach(t -> System.out.println(t));

		System.out.println("-----------Method reference--------------");
		//
		names.forEach(System.out::println);

	}

}
