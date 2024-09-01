package com.exercise.test.testReferenceMemory;

import java.util.ArrayList;
import java.util.List;

public class ExampleReference {

	public void exaple() {
		List<DataDTO> elements = new ArrayList<>();
		DataDTO element = new DataDTO();

		for (int i = 0; i < 10; ++i) {
			element.setIndex(i);
			elements.add(element);
		}

		elements.forEach(aux -> System.out.println("Indice: " + aux.getIndex()));
	}
}
